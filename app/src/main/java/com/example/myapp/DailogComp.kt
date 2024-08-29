package com.example.myapp

import android.app.AlertDialog
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.TextButton
import androidx.compose.ui.unit.dp


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AlertBox() {
    var isDialog by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { isDialog = true }) {
            Text(text = "Click Here")
        }
        if (isDialog === true) {

            AlertDialog(onDismissRequest = { /*TODO*/ },

                title = { Text(text = "Dialog Box") },
                text = { Text(text = "Do you want to proceed with the payment?") },
                modifier = Modifier.fillMaxWidth(),
                confirmButton = {

                    Button(onClick = { isDialog = false }) {
                        Text(text = "Confirm")
                    }
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Dismiss")
                    }

                }
            )
        }
    }
}
