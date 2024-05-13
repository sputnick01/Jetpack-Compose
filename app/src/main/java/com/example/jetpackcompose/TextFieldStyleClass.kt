package com.example.jetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
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

class TextFieldStyleClass : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstApp()
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun FirstApp() {

        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

            var textFieldValue by remember {
                mutableStateOf("")
            }


            Column(verticalArrangement = Arrangement.spacedBy(25.dp)) {

//                TextField(
//                    value = textFieldValue,
//                    onValueChange = { newText ->
//                        textFieldValue = newText
//
//                    },
//                    singleLine = true,
//                    modifier = Modifier.width(250.dp),
//                    label = { Text(text = "please enter text ") },
//                    placeholder = { Text(text = "habibi75@gmail.com") },
//                    leadingIcon = {
//                        Icon(
//                            imageVector = Icons.Filled.Email,
//                            contentDescription = ""
//                        )
//                    },
//                    trailingIcon = {
//                        IconButton(onClick = {
//                            Toast.makeText(applicationContext, "Test", Toast.LENGTH_LONG).show()
//                        }) {
//                            Icon(imageVector = Icons.Filled.Send, contentDescription = "")
//                        }
//                    },
//                    color = TextFieldDefaults.textFieldColors(
//                        focusedIndicatorColor =Color.Red
//                    )
//                )


            }

        }

    }

    @Preview
    @Composable
    fun AppPreview() {
        FirstApp()
    }
}