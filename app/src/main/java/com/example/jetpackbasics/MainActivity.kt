package com.example.jetpackbasics

import android.os.Bundle
import android.text.Layout
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import com.example.jetpackbasics.ui.JetpackBasicsTheme
import com.example.jetpackbasics.ui.typography

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackBasicsTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    //  Greeting("Android")
                    MiCard()
                }
            }
        }
    }
}

@Composable
fun MiCard() {
    Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(24.dp).fillMaxWidth().fillMaxHeight()
    ) {
        val imageModifier = Modifier.preferredHeight(200.dp)
                .width(200.dp)
                .clip(RoundedCornerShape(32.dp))
                        Image (
                        asset = imageResource(id = R.drawable.dp),
                        modifier = imageModifier)
        Text(text = "Nav Singh", style = TextStyle(color = Color.Blue, fontWeight = FontWeight.Bold, fontSize = 24.sp))
        Text(text = "Mobile: 5*4-7**-***3", style = typography.body1)
        Text(text = "Email: nav****@gmail.com", style = typography.body1)
    }
}

@Preview()
@Composable
fun MiCardPreview() {
    JetpackBasicsTheme {
        MiCardPreview()
    }
}