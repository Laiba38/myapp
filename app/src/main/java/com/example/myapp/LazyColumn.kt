package com.example.myapp

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun ContactList() {

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(5.dp),
        modifier = Modifier.fillMaxHeight()
    ) {
        item {
            Column(modifier = Modifier.padding(16.dp)) {

                Row {

                    Icon(
                        Icons.Filled.Person,
                        contentDescription = "Icon",
                        modifier = Modifier
                            .size(25.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))

                    Column {
                        Row {
                            Text(
                                text = " Name :",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                            Text(
                                text = " Laiba Aosaf",
                                fontSize = 16.sp
                            )
                        }
                        Row {
                            Text(
                                text = " Email  :",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                            Text(
                                text = " laibaaosaf@gmail.com",
                                fontSize = 16.sp
                            )
                        }
                        Row {
                            Text(
                                text = " Number :",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                            Text(
                                text = " +92345678910",
                                fontSize = 16.sp
                            )
                        }
                    }
                }
                    Spacer(modifier = Modifier.height(16.dp))

                Row {
                    Icon(
                        Icons.Filled.Person,
                        contentDescription = "Icon",
                        modifier = Modifier
                            .size(25.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))

                    Column {
                        Row {
                            Text(
                                text = " Name :",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                            Text(
                                text = " John",
                                fontSize = 16.sp
                            )
                        }
                        Row {
                            Text(
                                text = " Email  :",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                            Text(
                                text = "  john56@gmail.com",
                                fontSize = 16.sp
                            )
                        }
                        Row {
                            Text(
                                text = " Number :",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                            Text(
                                text = " +92345678910",
                                fontSize = 16.sp
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))

                Row {

                    Icon(
                        Icons.Filled.Person,
                        contentDescription = "Icon",
                        modifier = Modifier
                            .size(25.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))

                    Column {
                        Row {
                            Text(
                                text = " Name :",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                            Text(
                                text = " Shanza Gulab",
                                fontSize = 16.sp
                            )
                        }
                        Row {
                            Text(
                                text = " Email  :",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                            Text(
                                text = " shanz60@gmail.com",
                                fontSize = 16.sp
                            )
                        }
                        Row {
                            Text(
                                text = " Number :",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                            Text(
                                text = " +92345678910",
                                fontSize = 16.sp
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))

                Row {

                    Icon(
                        Icons.Filled.Person,
                        contentDescription = "Icon",
                        modifier = Modifier
                            .size(25.dp)
                    )
                    Spacer(modifier = Modifier.width(16.dp))

                    Column {
                        Row {
                            Text(
                                text = " Name :",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                            Text(
                                text = " Nimra Arshad",
                                fontSize = 16.sp
                            )
                        }
                        Row {
                            Text(
                                text = " Email  :",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                            Text(
                                text = "  manimra56@gmail.com",
                                fontSize = 16.sp
                            )
                        }
                        Row {
                            Text(
                                text = " Number :",
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                            Text(
                                text = " +92345678910",
                                fontSize = 16.sp
                            )
                        }
                    }
                }
            }
        }
    }
}



