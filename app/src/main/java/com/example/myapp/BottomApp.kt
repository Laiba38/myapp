package com.example.myapp

import androidx.collection.floatIntMapOf
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@ExperimentalMaterial3Api
@Composable
@Preview(
    showSystemUi = true ,
    showBackground = true
)
fun MainFunction() {
    Scaffold (
        bottomBar = { BottomAppBarExample()}
    ){
            innerpadding -> (innerpadding)

    }
      com.example.myapp.TextStyle()
}
@Composable
fun TextStyle() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
            .padding(16.dp)
    ){
        Text(text = "Hello everyone, how are you all doing?",
            fontSize = 35.sp,
            fontWeight = FontWeight.ExtraBold
        )

    }
}
@ExperimentalMaterial3Api
@Composable
fun BottomAppBarExample() {

    BottomAppBar( containerColor = Color.Cyan,
        actions = {
            Column(modifier = Modifier.padding(start = 25.dp)) {
                Icon(
                    Icons.Outlined.Home,
                    contentDescription = "Home",
                    modifier = Modifier.size(40.dp),
                    tint = Color.Black

                )
                Text(
                    text = "Home",
                    fontWeight = FontWeight.Bold,

                    )
            }

            Spacer(modifier = Modifier.padding(start = 35.dp))

            Column(modifier = Modifier.padding(start = 25.dp)) {
            Icon(
                Icons.Outlined.Search,
                contentDescription = "Search",
                modifier = Modifier.size(40.dp),
                tint = Color.Black
            )
            Text(
                text = "Search",
                fontWeight = FontWeight.Bold,
                )
        }
            Spacer(modifier = Modifier.padding(start = 35.dp))

                Column(modifier = Modifier.padding(start = 25.dp)) {
            Icon(
                Icons.Outlined.Person,
                contentDescription = "Person",
                modifier = Modifier.size(40.dp),
                tint = Color.Black

            )
            Text(
                text = "Profile",
                fontWeight = FontWeight.Bold,
            )
        }
                Spacer(modifier = Modifier.padding(start = 35.dp))
                Column(modifier = Modifier.padding(start = 25.dp)) {
                    Icon(
                        Icons.Outlined.Menu,
                        contentDescription = "Menu",
                        modifier = Modifier.size(40.dp),
                        tint = Color.Black

                    )
                    Text(
                        text = "Menu",
                        fontWeight = FontWeight.Bold,
                    )
                }
       }
   )
}
