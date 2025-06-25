package com.example.musicplayer.screen.player

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicplayer.component.CurrentMusic
import com.example.musicplayer.service.MusicProgressBar
import com.example.musicplayer.ui.theme.PrimaryColor

@Composable
fun MiddleBox(){
    var progress by remember { mutableStateOf(0f) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .border(width = 3.dp,
                color = PrimaryColor,
                shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp) )
            .background(color = PrimaryColor,
                shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp)
            ),
        contentAlignment = Alignment.TopStart
    ) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(
                color = PrimaryColor,
                shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp)
            )
            .border(width = 3.dp,
                color = PrimaryColor,
                shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp) )
            .padding(vertical = 5.dp,
                horizontal = 12.dp),
            contentAlignment = Alignment.Center
        ) {
            Column {

                CurrentMusic()

                MusicProgressBar()

            }

        }
    }
}