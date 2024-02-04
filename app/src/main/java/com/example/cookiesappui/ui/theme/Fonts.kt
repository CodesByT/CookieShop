package com.example.cookiesappui.ui.theme


import android.graphics.fonts.FontStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.googlefonts.Font
import com.example.cookiesappui.R

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val fontFamily1 = FontFamily(
    Font(
        googleFont = GoogleFont("Lobster Two"),
        fontProvider = provider,
        weight = FontWeight.Bold,
    )
)
val fontFamily2 = FontFamily(
    Font(
        googleFont = GoogleFont("Patrick Hand"),
        fontProvider = provider,
        weight = FontWeight.Bold,
    )
)
val fontFamily3 = FontFamily(
    Font(
        googleFont = GoogleFont("Gaegu"),
        fontProvider = provider,
        weight = FontWeight.Bold,
    )
)
