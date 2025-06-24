package com.example.musicplayer.screen.player

import CirBtn
import RecBtn
import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicplayer.ui.theme.PrimaryColor

@Composable
fun PlayerScreen() {
    var progress by remember { mutableStateOf(0f) }

    Column(modifier = Modifier.fillMaxSize()
        .background(color = Color.Black)) {

        Box(modifier = Modifier.fillMaxWidth()
            .height(150.dp)
            .background(color = PrimaryColor)){

Row(modifier = Modifier.fillMaxSize()
    .padding(horizontal = 20.dp),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.SpaceBetween) {
    RecBtn(onClick = {}, icon = Icons.Default.ArrowBack)
    Text("Now Playing", color = Color.White, fontSize = 16.sp)
    RecBtn(onClick = {}, icon = Icons.Default.Info)
}
        }

        Spacer(Modifier.height(430.dp))


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(PrimaryColor),
contentAlignment = Alignment.TopStart
        ) {
            Box(modifier = Modifier.fillMaxWidth()
                .background(PrimaryColor)
                .padding(12.dp),
                contentAlignment = Alignment.Center
            ) {
                Column {




                    LinearProgressIndicator(
                        progress = progress.coerceIn(0f, 1f),
                        modifier = Modifier.padding(horizontal = 20.dp)
                            .height(7.dp)
                            .fillMaxWidth(),

                        color = Color.White,
                    )
                    Text("The Velvet Underground")
                }

            }
        }


        Box(
            modifier = Modifier
                .padding(top = 2.dp)
                .fillMaxSize()
                .background(color = PrimaryColor)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f), // Share space equally
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    CirBtn(onClick = {}, icon = Icons.Default.MoreVert)
                    CirBtn(onClick = {}, icon = Icons.Default.Refresh)
                }
                Column {
                    Box(
                        modifier = Modifier
                            .size(180.dp)
                            .background(
                                brush = Brush.radialGradient(
                                    colors = listOf(
                                        Color(0xFF252622),
                                        Color.Black
                                    ),
                                    radius = 180f
                                ),
                                shape = CircleShape
                            )
                            .clip(CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.SpaceBetween,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            // 🔼 Top Icon/Button
                            Icon(
                                imageVector = Icons.Filled.Favorite,
                                contentDescription = "Favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .padding(top = 12.dp)
                                    .size(32.dp)
                            )

                            // 🔳 Center Row (Left - Play - Right)
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(16.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.KeyboardArrowLeft,
                                    contentDescription = "Previous",
                                    tint = Color.White,
                                    modifier = Modifier.size(32.dp)
                                )

                                CirBtn(onClick = {}, icon = Icons.Default.PlayArrow)

                                Icon(
                                    imageVector = Icons.Filled.KeyboardArrowRight,
                                    contentDescription = "Next",
                                    tint = Color.White,
                                    modifier = Modifier.size(32.dp)
                                )
                            }

                            // 🔽 Bottom Icon/Button
                            Icon(
                                imageVector = Icons.Filled.ThumbUp,
                                contentDescription = "Like",
                                tint = Color.White,
                                modifier = Modifier
                                    .padding(bottom = 12.dp)
                                    .size(32.dp)
                            )
                        }
                    }
                }


                Column(
                    modifier = Modifier
                        .weight(1f), // Same as other column
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    CirBtn(onClick = {}, icon = Icons.Default.List)
                    CirBtn(onClick = {}, icon = Icons.Default.Person)
                }
            }

        }


    }
    }
