package com.example.musicplayer.screen.player

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicplayer.R

@Composable
fun ImageBox(){


    Box(modifier =Modifier
        .fillMaxWidth()
        .padding(top = 110.dp, bottom = 20.dp),
        contentAlignment = Alignment.Center) {
        Image(painter = painterResource(id = R.drawable.wavy),
            contentDescription = "Albem Cover",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(280.dp)
                .clip(RoundedCornerShape(16.dp)
                ))
    }

}