package com.example.musicplayer.service

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.musicplayer.R

object PlaybackController {
    private var mediaPlayer: MediaPlayer? = null
    var isPlaying by mutableStateOf(false)
    var currentPosition by mutableStateOf(0)
    var duration by mutableStateOf(1) // Avoid divide-by-zero

    fun init(context: Context) {
        if (mediaPlayer == null) {
            mediaPlayer = MediaPlayer.create(context, R.raw.wavy)
            duration = mediaPlayer?.duration ?: 1
        }
    }

    fun toggle() {
        mediaPlayer?.let {
            if (isPlaying) it.pause() else it.start()
            isPlaying = !isPlaying
        }
    }

    fun release() {
        mediaPlayer?.release()
        mediaPlayer = null
        isPlaying = false
        currentPosition = 0
    }

    fun updateProgress() {
        mediaPlayer?.let {
            currentPosition = it.currentPosition
        }
    }
}
