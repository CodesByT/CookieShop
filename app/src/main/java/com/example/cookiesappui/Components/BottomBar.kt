package com.example.cookiesappui.Components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.cookiesappui.ui.theme.fontFamily2

@Composable
fun myNavigationBar(modifier: Modifier = Modifier) {
    NavigationBar (
        modifier = modifier
            .padding(8.dp)
            .clip(
                RoundedCornerShape(
                    35.dp, 35.dp, 18.dp, 18.dp
                )
            ),
        containerColor = Color(0xFF292929),
        contentColor = Color(0xFFe38035),
        content = {
            NavigationBarItem(
                selected = false,
                onClick = {  },
                icon = {
                    Icon(
                        imageVector = Icons.Outlined.Home,
                        contentDescription ="",
                        tint = Color(0xFFe38035)
                    ) },
                label = {
                    Text(text = "Home",fontFamily = fontFamily2)
                }
            )
            NavigationBarItem(
                selected = false,
                onClick = {  },
                icon = {
                    Icon(
                        imageVector = Icons.Outlined.ShoppingCart,
                        contentDescription ="",
                        tint = Color(0xFFe38035)
                    ) },
                label = {
                    Text(text = "Cart",fontFamily = fontFamily2)
                }
            )
            NavigationBarItem(
                selected = false,
                onClick = {  },
                icon = {
                    Icon(
                        imageVector = Icons.Outlined.Search,
                        contentDescription ="",
                        tint = Color(0xFFe38035)
                    ) },
                label = {
                    Text(text = "Search",fontFamily = fontFamily2)
                }
            )


        }
    )
}
