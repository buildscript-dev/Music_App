import androidx.compose.foundation.Image
import androidx.compose.foundation.border

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.example.musicplayer.ui.theme.PriButColor

@Composable
fun RecBtn(
    onClick: () -> Unit,
    icon: ImageVector? = null,
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = PriButColor,
            contentColor = Color.White
        ),
        contentPadding = PaddingValues(0.dp),
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 0.dp),
        modifier = Modifier
            .width(68.dp)
            .height(40.dp)
            .border(width = 2.dp, color = Color.Black, shape = RoundedCornerShape(12.dp))
    ) {
        icon?.let {
            Icon(
                imageVector = it,
                contentDescription = "Back",
                tint = Color.White
            )
        }
    }
}



@Composable
fun CirBtn(
    onClick: () -> Unit,
    icon: ImageVector? = null,
    painter: Painter? = null, // ✅ for PNGs or other drawable images
    contentDesc: String = "",
) {
    Button(
        onClick = onClick,
        shape = CircleShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = PriButColor,
            contentColor = Color.White
        ),
        contentPadding = PaddingValues(0.dp),
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 0.dp),
        modifier = Modifier
            .size(70.dp)
            .border(width = 2.dp, color = Color.Black, shape = CircleShape)
    ) {
        when {
            icon != null -> {
                Icon(
                    imageVector = icon,
                    contentDescription = contentDesc,
                    tint = Color.White
                )
            }
            painter != null -> {
                Image(
                    painter = painter,
                    colorFilter = ColorFilter.tint(
                        color = Color.White
                    ),
                    contentDescription = contentDesc,
                    modifier = Modifier.size(28.dp) // adjust if needed
                )
            }
        }
    }
}
