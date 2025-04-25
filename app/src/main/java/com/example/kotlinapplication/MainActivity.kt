package com.example.kotlinapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinapplication.ui.theme.KotlinApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinApplicationTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText("Happy Birthday Hüseyin :)", from = "from Büşra", modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}


@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier, verticalArrangement = Arrangement.Center){
        Text(
            text = message,
            fontSize = 80.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = modifier.padding(16.dp).align(alignment = Alignment.End)
        )
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Surface(color = Color.White) {
//        Text(
//        text = "Hello, my name is $name!",
//        modifier = modifier
//        )
//    }
//}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BirthdayCardPreview() {
    KotlinApplicationTheme {
        GreetingText("Happy Birthday Hüseyin :)", from = "from Büşra")
    }
}