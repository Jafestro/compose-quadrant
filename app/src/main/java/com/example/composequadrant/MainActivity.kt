package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrant()
                }
            }
        }
    }
}

@Composable
fun Quadrant(modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxSize())
    {
        Column(modifier = modifier.fillMaxHeight().fillMaxWidth(0.5f)) {
            Card(modifier = modifier.fillMaxHeight(0.5f).fillMaxWidth(),RectangleShape)
            {
                Text(text = "Hello")
            }
            Card(modifier = modifier.fillMaxSize(), RectangleShape)
            {
                Text(text = "Hello")
            }
        }
        Column(modifier = modifier.fillMaxHeight().fillMaxWidth()) {
            Card(modifier = modifier.fillMaxHeight(0.5f).fillMaxWidth(), RectangleShape) {
                Text(text = "Hello")
            }
            Card(modifier = modifier.fillMaxSize(), RectangleShape) {
                Text(text = "Hello")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        Quadrant()
    }
}