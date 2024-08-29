package com.example.myapp

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewFunnction() {
    SimpleButton()


}
@Composable
fun SimpleButton() {
       Column(
           horizontalAlignment = Alignment.CenterHorizontally,
           verticalArrangement = Arrangement.Center,
           modifier = Modifier.fillMaxSize()
       ) {
           Text(text = "Hello Buttons",
               fontSize = 25.sp,
               fontWeight = FontWeight.ExtraBold,
               )
           Button(
               onClick = { /*TODO*/ },
               colors = ButtonDefaults.buttonColors(
                   containerColor = Color.Blue,
                   contentColor = Color.White
               ), modifier = Modifier.padding(20.dp)
                   .width(150.dp)
           )
           {
               Text(
                   text = "Click me",
                   fontSize = 20.sp
               )

           }
           Button(
               onClick = { /*TODO*/ },
               colors = ButtonDefaults.buttonColors(
                   containerColor = Color.Cyan,
                   contentColor = Color.White
               ), modifier = Modifier.padding(20.dp)
                   .width(150.dp)
           )
           {
               Text(
                   text = "Submit",
                   fontSize = 20.sp
               )
           }
           Button(
               onClick = { /*TODO*/ },
               colors = ButtonDefaults.buttonColors(
                   containerColor = Color.DarkGray,
                   contentColor = Color.White
               ), modifier = Modifier.padding(20.dp)
                            .width(150.dp)
           )
           {
               Text(
                   text = "Cancel",
                   fontSize = 20.sp
               )
           }
           Button(
               onClick = { /*TODO*/ },
               colors = ButtonDefaults.buttonColors(
                   containerColor = Color.Black,
                   contentColor = Color.White
               ), modifier = Modifier.padding(20.dp)
                   .width(150.dp)
           )
           {
               Text(
                   text = "Back",
                   fontSize = 20.sp
               )
           }
           Text(text = "hi")
       }
}



