package com.example.musicplayer.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicplayer.R
import com.example.musicplayer.ui.theme.PrimaryColor


@Composable
fun CurrentMusic() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .border(width = 2.dp, color = PrimaryColor, shape = RoundedCornerShape(20.dp))
            .padding(10.dp, bottom = 16.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(Color.Black)
            .padding(vertical = 8.dp, horizontal = 12.dp) // inner padding inside the box
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // 🔊 Album Image
            Image(
                painter = painterResource(id = R.drawable.wavy),
                contentDescription = "Album Cover",
                modifier = Modifier.size(40.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(10.dp))
            )

            // Add a lil space
            Spacer(modifier = Modifier.width(12.dp))

            // 🎵 Song Info
            Column(
                modifier = Modifier.weight(1f) // take up remaining space
            ) {
                Text(
                    text = "TwinBeatz - Wavy",
                    fontSize = 16.sp,
                    color = Color.Gray
                )
                Text(
                    text = "Wavy!",
                    fontSize = 18.sp,
                    color = Color.White
                )
            }

            // 👥 Follow Button
            Spacer(modifier = Modifier.width(12.dp))

            Button(
                onClick = {},
                shape = RoundedCornerShape(25.dp),
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                ),

            ) {
                Text(text = "Follow", fontSize = 15.sp)
            }
        }
    }
}
