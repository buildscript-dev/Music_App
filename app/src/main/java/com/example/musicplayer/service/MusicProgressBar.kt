package com.example.musicplayer.service

import MusicPlayButton
import android.content.Context
import android.media.MediaPlayer
import androidx.compose.foundation.layout.*
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicplayer.R
import kotlinx.coroutines.delay

@Composable
fun MusicProgressBar() {
    val context = LocalContext.current
    PlaybackController.init(context)

    val isPlaying by remember { derivedStateOf { PlaybackController.isPlaying } }
    val duration by remember { derivedStateOf { PlaybackController.duration } }
    val currentPosition by remember { derivedStateOf { PlaybackController.currentPosition } }

    // 🔁 Update time every 500ms when playing
    LaunchedEffect(isPlaying) {
        while (isPlaying) {
            PlaybackController.updateProgress()
            delay(500L)
        }
    }

    MusicProgress(
        currentPosition = currentPosition,
        duration = duration
    )
}



@Composable
fun MusicProgress(currentPosition: Int, duration: Int) {
    val progress = currentPosition / duration.toFloat()

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    ) {
        LinearProgressIndicator(
            progress = progress.coerceIn(0f, 1f),
            modifier = Modifier
                .fillMaxWidth()
                .height(6.dp),
            color = Color.White
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = formatTime(currentPosition), color = Color.White, fontSize = 13.sp)
            Text(text = formatTime(duration), color = Color.White, fontSize = 13.sp)
        }
    }
}


fun formatTime(ms: Int): String {
    val totalSec = ms / 1000
    val min = totalSec / 60
    val sec = totalSec % 60
    return String.format("%d:%02d", min, sec)
}
