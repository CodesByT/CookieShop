package com.example.cookiesappui.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Badge
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cookiesappui.R
import com.example.cookiesappui.ui.theme.fontFamily1
import com.example.cookiesappui.ui.theme.fontFamily2
import com.example.cookiesappui.ui.theme.fontFamily3


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(scrollBehavior: TopAppBarScrollBehavior, modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(text = "Cookie Shop", fontFamily = fontFamily2, fontSize = 30.sp)
        },
        modifier = modifier
            .wrapContentWidth()
            .padding(6.dp),
        navigationIcon = {
            Image(
                painter = painterResource(id = R.drawable.c),
                contentDescription = "",
                modifier = modifier
                    .size(110.dp)
                    .padding(6.dp)
            )
        },
        actions = {
            Box(
                modifier = modifier
                    .size(60.dp)
                    .padding(top =5.dp,end=5.dp)
                ,
                //contentAlignment = Alignment.TopEnd
            ){
                Image(
                    painter = painterResource(id = R.drawable.b),
                    contentDescription = "",
                    modifier = modifier
                        .clip(CircleShape)
                        .size(50.dp)
                        .align(alignment = Alignment.Center)
                )
                Badge (

                    modifier = modifier.size(20.dp).align(alignment = Alignment.TopEnd),
                    containerColor =  Color(0xFFCA0606)
                ){
                    Text(text = "3")
                }

            }
        },
        scrollBehavior = scrollBehavior,
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Color.DarkGray,
            scrolledContainerColor = Color.DarkGray
        )
    )
}
