package com.example.myapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CardComponent() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()

    ) {
        Text(text = "It's my Card",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 30.sp)

        Spacer(modifier = Modifier.height(10.dp))
        Card(
            colors = CardDefaults.cardColors(Color(0xFFE0AE65)),
            modifier = Modifier
                .padding(
                    horizontal = 10.dp,
                    vertical = 10.dp
                )
                .shadow(5.dp, shape = RoundedCornerShape(CornerSize(10.dp)))
        ) {

           Row(

                modifier = Modifier
                    .padding(16.dp)
           ) {

               Image(
                   painter = painterResource(id = R.drawable.picture),
                   contentDescription = "Pic",
                   contentScale = ContentScale.Crop,
                   modifier = Modifier
                       .width(110.dp)
                       .height(158.dp)

                       .padding(top = 10.dp)
                       .clip(RoundedCornerShape(16.dp))
               )
               Spacer(modifier = Modifier.width(40.dp))

               Column {
                   Row {
                       Text(text = "Louis Vuitton",
                           fontWeight = FontWeight.ExtraBold,
                           fontSize = 20.sp)
                   }
                   Spacer(modifier = Modifier.height(10.dp))

                   Text(text = "Louis Vuitton,is a premier\nluxury fashion house,\nincluding handbags,\nluggage,and accessories.\nwhich combines like interlocking \" L\" and \"V\" initials, and its  classic color\nscheme of brown and gold.",
                       fontWeight = FontWeight.Medium)

                   }

           }

        }
    }
}