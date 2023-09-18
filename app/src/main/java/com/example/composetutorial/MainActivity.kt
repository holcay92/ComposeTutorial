package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SnackBarExample()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SnackBarExample() {
    var snackBarVisible by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "snackBar Example") },
            )
        },
        content = {
            Column(
                modifier = Modifier.padding(paddingValues = it)
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Button(
                    onClick = {
                        snackBarVisible = true
                    },
                    modifier = Modifier.padding(8.dp),
                ) {
                    Text(text = "Show snackBar")
                }

                if (snackBarVisible) {
                    Snackbar(
                        modifier = Modifier.padding(8.dp),

                        action = {
                            TextButton(
                                onClick = {
                                    snackBarVisible = false
                                },
                            ) {
                                Text(text = "Dismiss")
                            }
                        },
                    ) {
                        Text(text = "example message.")
                    }
                }
            }
        },
    )
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    SnackBarExample()
}
