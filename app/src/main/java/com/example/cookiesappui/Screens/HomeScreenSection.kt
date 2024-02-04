package com.example.cookiesappui.Screens

import Model.CookiesData
import android.text.style.TtsSpan.CardinalBuilder
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cookiesappui.Components.CookiesRows
import com.example.cookiesappui.R
import com.example.cookiesappui.ui.theme.fontFamily2

@Composable
fun ScreenLabelsSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                modifier = Modifier.size(25.dp),
                painter = painterResource(id = R.drawable.d),
                contentDescription ="",
                tint = Color(0xFFFFA726)
            )
            Text(
                modifier = Modifier.padding(start = 8.dp),
                text = "Premium", fontFamily = fontFamily2, color = Color(0xFFFFA726), fontSize = 25.sp
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom
        ){
            Text(
                text = "Today's Special",fontFamily = fontFamily2, fontSize = 31.sp
            )
            Text(
                text = "see more",fontFamily = fontFamily2,fontSize = 18.sp, color = Color(0xFFFFA726)
            )

        }
        CookiesRows()
        Spacer(modifier = Modifier.height(20.dp))
        OffersSection()

    }
}

@Composable
fun OffersSection() {
    OffersLabel()
    OffersList()
}
@Composable
fun OffersLabel() {
    Row(
        modifier = Modifier.padding(top=20.dp, bottom = 20.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Bottom
    ){
        Text(
            text = "Today's Offers",fontFamily = fontFamily2, fontSize = 40.sp
        )
        Text(

            text = "see more",fontFamily = fontFamily2,fontSize = 18.sp, color = Color(0xFFFFA726)
        )

    }
}

@Composable
fun OffersList() {
    val offeredCookiesList = listOf<CookiesData>(
        CookiesData(
            image = painterResource(id = R.drawable.c8),
            name = "Pink Powder Puff",
            normalPrice = "$ 18",
            currentPrice = "$ 14"

        ),
        CookiesData(
            image = painterResource(id = R.drawable.c6),
            name = "Choco Lava Magic",
            normalPrice = "$ 18",
            currentPrice = "$ 15"
        ),
        CookiesData(
            image = painterResource(id = R.drawable.c7),
            name = "Springle White",
            currentPrice = "$ 14",
            normalPrice = "$ 18"

        ),
        CookiesData(
            image = painterResource(id = R.drawable.c2),
            name = "Double Choco Blast",
            normalPrice = "$ 18",
            currentPrice = "$ 14"

        ),
    )
    LazyRow(
        modifier = Modifier
            .fillMaxSize() ,
        content = {
            items(offeredCookiesList.size){
                it->
                offeredCookiesList[it].normalPrice?.let{
                    normalPrice->
                        OfferCardBuilder(
                            image = offeredCookiesList[it].image,
                            name = offeredCookiesList[it].name,
                            currentPrice = offeredCookiesList[it].currentPrice,
                            normalPrice = offeredCookiesList[it].normalPrice,
                        )
                }
            }
        })
}

@Composable
fun OfferCardBuilder(image: Painter, name: String, currentPrice: String, normalPrice: String?) {

    Box (
        modifier = Modifier
            .padding(top = 20.dp, end = 20.dp)
            .fillMaxWidth(),

        contentAlignment = Alignment.TopCenter
    ){
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(130.dp)
                ,
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF333333)
            ),
            shape = RoundedCornerShape(25.dp,25.dp,90.dp,25.dp),
            elevation = CardDefaults.cardElevation(18.dp)

        ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = image,
                contentDescription = "Image",
                modifier = Modifier
                    .padding(top= 15.dp,start= 15.dp, bottom = 15.dp,end = 5.dp,)
                    .size(85.dp)
                    .shadow(elevation = 50.dp)
            )
            Column (
                modifier = Modifier.padding(end =10.dp),
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
                        //modifier = Modifier.padding(start = 8.dp),
                        text = "Premium", fontFamily = fontFamily2, color = Color(0xFFFFA726), fontSize = 15.sp
                    )

                }
            }
            Column (
                modifier = Modifier.padding(end=35.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.SpaceEvenly
            ){
                if (normalPrice != null) {
                    Text(
                        text = normalPrice,
                        fontFamily = fontFamily2,
                        fontSize = 22.sp,
                        textDecoration = TextDecoration.LineThrough,
                        color = Color(0xFF940303),
                        fontWeight = FontWeight.Bold
                    )
                }
                Text(
                    text = currentPrice,
                    fontFamily = fontFamily2,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )

            }
        }
        }
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




















