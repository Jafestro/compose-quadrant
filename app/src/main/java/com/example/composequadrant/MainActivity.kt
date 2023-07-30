package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
        Column(modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(0.5f))
        {
            CardView(color = Color(0xFFEADDFF),
                name = stringResource(R.string.text_composable_name),
                description = stringResource(R.string.text_composable_description),
                f = 0.5f
            )
            CardView(color = Color(0xFFB69DF8),
                name = stringResource(R.string.row_composable_name),
                description = stringResource(R.string.row_composable_description),
                f = 1f
            )
        }

        Column(modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth())
        {
                CardView(color = Color(0xFFD0BCFF),
                    name = stringResource(R.string.image_composable_name),
                    description = stringResource(R.string.image_composable_description),
                    f = 0.5f)
                CardView(color = Color(0xFFF6EDFF)
                    , name = stringResource(R.string.column_composable_name)
                    , description = stringResource(R.string.column_composable_description),
                    f = 1f
                )
        }
    }
}

@Composable
fun CardView(color: Color, name: String, description: String,
             modifier: Modifier = Modifier, f: Float)
{
    Card(
        modifier = Modifier
            .fillMaxHeight(f)
            .fillMaxWidth(),
        RectangleShape,
        colors = CardDefaults.cardColors(containerColor = color),
    )
    {
        Column(modifier = modifier
            .padding(16.dp)
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center)
        {
            Text(
                text = name,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp),
                textAlign = TextAlign.Justify
            )
            Text(
                text = description,
                textAlign = TextAlign.Left
            )

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