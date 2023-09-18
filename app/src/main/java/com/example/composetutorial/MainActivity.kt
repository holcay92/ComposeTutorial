package com.example.composetutorial

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                ButtonDemo()
            }
        }
    }
}

@Composable
fun ButtonDemo() {
    val context = LocalContext.current
    Button(
        onClick = { Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show() },
    ) {
        Text(text = "Button")
    }
    Button(
        onClick = { Toast.makeText(context, "Button Clicked 2", Toast.LENGTH_SHORT).show() },
        enabled = false,
    ) {
        Text(text = "Button")
    }
    TextButton(
        onClick = { Toast.makeText(context, "TextButton Clicked", Toast.LENGTH_SHORT).show() },
    ) {
        Text(text = "Button")
    }
    OutlinedButton(
        onClick = { Toast.makeText(context, "OutlinedButton Clicked", Toast.LENGTH_SHORT).show() },
    ) {
        Text(text = "Button")
    }
    IconButton(onClick = {
        Toast.makeText(context, "IconButton Clicked", Toast.LENGTH_SHORT).show()
    }) {
        Icon(
            Icons.Filled.Refresh,
            contentDescription = "Refresh Icon",
            tint = Color.Red,
            modifier = Modifier.size(60.dp),
        )
    }
    Button(
        onClick = { Toast.makeText(context, "Styled Button Clicked", Toast.LENGTH_SHORT).show() },
        shape = CutCornerShape(10.dp),
        contentPadding = PaddingValues(16.dp),
        border = BorderStroke(10.dp, Color.Gray),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Green,
            contentColor = Color.White,
        ),
    ) {
        Text(text = "Button")
    }
}
