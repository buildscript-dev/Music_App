import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import com.example.musicplayer.R
import com.example.musicplayer.service.PlaybackController

@Composable
fun MusicPlayButton() {
    val context = LocalContext.current
    PlaybackController.init(context)

    val isPlaying by remember { derivedStateOf { PlaybackController.isPlaying } }

    CirBtn(
        onClick = { PlaybackController.toggle() },
        painter = if (isPlaying)
            painterResource(id = R.drawable.pause)
        else
            painterResource(id = R.drawable.play)
    )
}
