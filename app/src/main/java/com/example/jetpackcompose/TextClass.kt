package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class TextClass :ComponentActivity() {
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
                .background(Color.White)
        ) {

            val myFont= FontFamily(Font(R.font.aldrich))
            Text(
                stringResource(id = R.string.sample_text).repeat(10),
                fontSize = 18.sp,
                fontFamily = myFont,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Red,
                maxLines = 10,
                overflow = TextOverflow.Ellipsis


            )

        }

    }

    @Preview
    @Composable
    fun AppPreview() {
        FirstApp()
    }
}