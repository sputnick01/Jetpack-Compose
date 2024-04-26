package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstApp()
        }
    }

    @Composable
    fun FirstApp() {

//    Surface
        //        Surface(
//            modifier = Modifier
//                .height(150.dp)
//                .width(200.dp)
//                .padding(16.dp),
//            color = Color.Green,
//            shape = RoundedCornerShape(10.dp),
//            border = BorderStroke(1.dp, color = Color.Red),
//            shadowElevation = 12.dp
//        ) {
//            Text(text = "For Test", fontSize = 22.sp, modifier = Modifier.padding(15.dp))
//
//        }

//        Column & Row & Box

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

