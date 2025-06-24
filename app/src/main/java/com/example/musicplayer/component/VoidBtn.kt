import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.example.musicplayer.ui.theme.PriButColor
import com.example.musicplayer.ui.theme.PrimaryColor

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
        modifier = Modifier.size(70.dp)
            .border(width = 2.dp, color = Color.Black, shape = CircleShape)
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
