package com.example.cookiesappui.Components

import Model.CookiesData
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cookiesappui.R
import com.example.cookiesappui.ui.theme.fontFamily2


@Composable
fun CookiesRows(){
    val cookiesList = listOf<CookiesData>(
        CookiesData(
            image = painterResource(id = R.drawable.c1),
            name = "Oatmeal Chocolate Chip",
            currentPrice = "$ 12"
        ),
        CookiesData(
            image = painterResource(id = R.drawable.c2),
            name = "Double Choco Blast",
            currentPrice = "$ 18"

        ),
        CookiesData(
            image = painterResource(id = R.drawable.c3),
            name = "Cinnamon Crust",
            currentPrice = "$ 12"

        ),
        CookiesData(
            image = painterResource(id = R.drawable.c4),
            name = "Jam Sweet Crumb",
            currentPrice = "$ 12"

        ),
        CookiesData(
            image = painterResource(id = R.drawable.c5),
            name = "Choco Chip Crack",
            currentPrice = "$ 15"

        ),
        CookiesData(
            image = painterResource(id = R.drawable.c6),
            name = "Choco Lava Magic",
            currentPrice = "$ 18"

        ),
        CookiesData(
            image = painterResource(id = R.drawable.c7),
            name = "Springle White",
            currentPrice = "$ 18"

        ),
        CookiesData(
            image = painterResource(id = R.drawable.c8),
            name = "Pink Powder Puff",
            currentPrice = "$ 18"

        )
    )

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp),
        content = {
            items(cookiesList.size){
                CardBuilder(
                    image = cookiesList[it].image,
                    name = cookiesList[it].name,
                    price = cookiesList[it].currentPrice
                )
                Spacer(modifier = Modifier.width(28.dp))

            }
        })
}

@Composable
fun CardBuilder(image: Painter, name: String, price: String) {

    Box(
        modifier = Modifier.wrapContentSize().padding(top = 20.dp),
        contentAlignment = Alignment.TopCenter
    ){
        Card(
            modifier = Modifier
                .padding(top = 100.dp)
                .height(150.dp)
                .width(160.dp).background(Color.Transparent),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF333333)
            ),
            shape = RoundedCornerShape(25.dp,25.dp,95.dp,25.dp),
            elevation = CardDefaults.cardElevation(18.dp)
        ){
            Column (
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.SpaceEvenly
            ){
                Text(text = name,fontFamily = fontFamily2, fontSize = 20.sp)
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Icon(
                        modifier = Modifier.size(16.dp),
                        painter = painterResource(id = R.drawable.d),
                        contentDescription ="", tint = Color(0xFFFFA726)
                    )
                    Text(
                        modifier = Modifier.padding(start = 8.dp),
                        text = "Premium", fontFamily = fontFamily2, color = Color(0xFFFFA726), fontSize = 15.sp
                    )
                }
                Text(text = price)
            }
        }
        Image(
            painter = image,
            contentDescription = "cookie image",
            modifier = Modifier
                .clip(CircleShape)
                .size(120.dp)
                .shadow(elevation = 50.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.r),
            contentDescription ="Arrow",
            modifier = Modifier
                .clip(CircleShape)
                .size(40.dp)
                .align(alignment = Alignment.BottomEnd)
                .background(Color.LightGray)
        )
    }
}
