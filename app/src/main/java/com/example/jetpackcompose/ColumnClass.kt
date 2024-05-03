package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ColumnClass : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstApp()
        }
    }
    @Composable
    fun FirstApp() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
            , contentAlignment = Alignment.Center
        ) {
            Box(modifier = Modifier
                .height(200.dp)
                .width(250.dp)
                .background(Color.Yellow)) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "test1", fontSize = 18.sp, color = Color.Cyan)
                    Text(text = "test2", fontSize = 18.sp, color = Color.Red)
                    Text(text = "test3", fontSize = 18.sp, color = Color.Green)

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