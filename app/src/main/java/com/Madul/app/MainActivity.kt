package com.Madul.app

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.AboutActivity
import com.Madul.app.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()
        }
    }
}

@Composable
fun Greeting() {

    LazyColumn(
        modifier = Modifier
            .background(Color.Gray)
//          .fillMaxWidth()
//          .fillMaxHeight()
            .fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {

        item {
            Row(
                Modifier
                    .fillMaxSize()
                    .background(color = Color.Cyan),
                horizontalArrangement = Arrangement.SpaceEvenly,
//
            ){

                Text(text = "Chats")
                Spacer(modifier = Modifier.width(45.dp))

                Text(text = "Status")
                Spacer(modifier = Modifier.width(45.dp))

                Text(text = "Calls")
                Spacer(modifier = Modifier.width(45.dp))

                Text(text = "Community")
                Spacer(modifier = Modifier.width(45.dp))

            }
            Spacer(modifier = Modifier.height(50.dp))



            Text(text = "This is my first ever Android project", color = Color.Red, fontSize = 13.sp, fontFamily = FontFamily.Monospace)
           
            
            Text(text = "This is my home page", color = Color.Blue, fontSize = 15.sp, fontFamily = FontFamily.Serif, modifier = Modifier.background(
                Color.Gray
            ))

            Text(text = "Hello",color = Color.Magenta, fontFamily = FontFamily.Cursive,fontSize = 19.sp)

            Text(text = "Hello", color = Color.Black, fontFamily = FontFamily.Cursive)

            val about = LocalContext.current
            Button(onClick = {
                about.startActivity(Intent(about,AboutActivity::class.java))

            },
                border = BorderStroke(2.dp, Color.Black),
                colors = ButtonDefaults.outlinedButtonColors(Color.Cyan),
//            colors = ButtonDefaults.buttonColors( Color.Cyan),
                //shape = RectangleShape
                shape = RoundedCornerShape(10.dp)
//             shape = CutCornerShape(10)

            ) {

                Text(text = "About Screen",color=Color.Black)

            }



        }

        }
    }

