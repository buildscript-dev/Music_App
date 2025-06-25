package com.example.musicplayer.screen.player

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicplayer.ui.theme.PrimaryColor
import RecBtn
import androidx.compose.ui.text.style.TextAlign


@Composable
fun TopBox(){
Box(modifier = Modifier.fillMaxWidth()){

    Box(modifier = Modifier
        .fillMaxWidth()
        .height(150.dp)
        .background(color = PrimaryColor)){

        Row(modifier = Modifier.fillMaxSize()
            .padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween)
        {
            RecBtn(onClick = {}, icon = Icons.Default.ArrowBack)
            Text("Now Playing", color = Color.White, fontSize = 16.sp)
            RecBtn(onClick = {}, icon = Icons.Default.Info)
        }
    }

    ImageBox()
}

}
