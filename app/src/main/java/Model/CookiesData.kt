package Model

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.cookiesappui.R

data class CookiesData(
    val image: Painter,
    val name: String,
    val normalPrice: String? = null,
    val currentPrice: String
)

