package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxExample()
        }
    }
}

@Composable
fun BoxExample() {
    Box(
        modifier = Modifier
            .background(Color.LightGray),
    ) {
        Image(
            painter = painterResource(id = R.drawable.image_face),
            contentDescription = "dice image",

        )
        Text(
            text = "test img",
            modifier = Modifier
                .background(Color.White)
                .align(Alignment.BottomStart),
        )
        Button(
            onClick = { },
            colors = ButtonDefaults.textButtonColors(
                containerColor = Color.Transparent,
                contentColor = Color.Black,
            ),
            modifier = Modifier

                .align(Alignment.TopEnd)
                .border(5.dp, Color.Red, RectangleShape),
        ) {
            Text(text = "Roll The Dice")

        }
    }
}
