package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ImageView : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstApp()
        }
    }

    @Composable
    fun FirstApp() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White), horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Card(
                modifier = Modifier
                    .height(250.dp)
                    .width(200.dp)
                    .border(2.dp, Color.Red),
                elevation = CardDefaults.cardElevation(15.dp),


                ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                ) {
//            Image(
//                painter = painterResource(id = R.drawable.ic_launcher_background),
//                contentDescription = "",
//                modifier = Modifier
//                    .height(200.dp)
//                    .width(180.dp)
//                    .border(2.dp, Color.Red),
//                contentScale = ContentScale.Crop
//            )
//            Spacer(modifier = Modifier.size(5.dp))
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = "",
                        modifier = Modifier
                            .height(100.dp)
                            .width(200.dp)
                            .clip(RoundedCornerShape(16.dp))
//                            .border(2.dp, Color.Red, RoundedCornerShape(16.dp)),
                        , contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.size(10.dp))
                    Text(
                        text = "Image",
                        fontSize = 18.sp,
                        fontStyle = FontStyle.Italic,
                        modifier = Modifier.padding(10.dp)
                    )
                    Spacer(modifier = Modifier.size(10.dp))
                    Text(
                        text = " the wiki sidebar, navigate to the page you want to change, and then click Edit. " +
                                "In the wiki toolbar, click . In the \"Insert Image\" dialog box, type the ",
                        fontSize = 13.sp,
                        fontStyle = FontStyle.Normal,
                        modifier = Modifier.padding(10.dp),
                        maxLines = 3,
                        overflow = TextOverflow.Ellipsis
                    )
                }

            }
        }


    }

    @Preview
    @Composable
    fun AppPreview() {
        FirstApp()
    }
}