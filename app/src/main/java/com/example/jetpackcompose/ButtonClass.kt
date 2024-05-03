package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ButtonClass :ComponentActivity() {
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
                .background(Color.White),
            verticalArrangement = Arrangement.spacedBy(45.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button", fontSize = 15.sp)
            }

            Button(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Add, contentDescription = "")
                Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
                Text(text = "Add", fontSize = 15.sp)
            }

            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(text = "OutlinedButton", fontSize = 15.sp)

            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Filled.Face,
                    contentDescription = "",
                    tint = Color.Red,
                    modifier = Modifier.size(35.dp)
                )
            }
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "TextButton", fontSize = 15.sp)
                Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
                Icon(imageVector = Icons.Filled.Face, contentDescription = "", tint = Color.Red)
            }

            var count by remember {
                mutableStateOf(0)
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .padding(10.dp),
                verticalArrangement = Arrangement.spacedBy(45.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Button(
                    onClick = { /*TODO*/ }, shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "RoundedCornerShape", fontSize = 15.sp)
                }

                Button(
                    onClick = { /*TODO*/ },
                    shape = CutCornerShape(10.dp)
                ) {
                    Text(text = "RoundedCornerShape", fontSize = 15.sp)
                }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier.size(50.dp),
                    shape = CircleShape,
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 10.dp, pressedElevation = 6.dp

                    )

                ) {
                    Icon(
                        imageVector = Icons.Filled.Add, contentDescription = "",
                        modifier = Modifier.size(30.dp)
                    )
                }
                Button(
                    onClick = { count++ }, shape = RoundedCornerShape(10.dp),
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 10.dp,
                        pressedElevation = 6.dp

                    ), colors = ButtonDefaults.buttonColors(

                        containerColor = Color(0xfffedbd0),
                        contentColor = Color.Cyan
                    )
                ) {
                    Text(text = "$count", fontSize = 15.sp)
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