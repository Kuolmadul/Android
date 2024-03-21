package com

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.Madul.app.MainActivity
import com.ui.theme.AppTheme

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                    About()
                }
            }
        }


@Preview(showBackground = true)
@Composable
fun About() {

    Column(
        modifier = Modifier
            .background(Color.Green)
            .fillMaxSize()
            .padding(10.dp)

    ) {

        Text(text = "About Screen")
        val home = LocalContext.current
        Button(onClick = {
            home.startActivity(Intent(home, MainActivity::class.java))

        },
            border = BorderStroke(2.dp, Color.Black),
            colors = ButtonDefaults.outlinedButtonColors(Color.Cyan),
            //colors = ButtonDefaults.buttonColors(Color.Black),
            //shape = RectangleShape
            //shape = RoundedCornerShape(10.dp),
            shape = CutCornerShape(10)
            ) {

            Text(text = "Home Screen",color=Color.White)
        }
        val jj= AnnotatedString("you want to go Home? Click Here!!")

        val ll = LocalContext.current
        ClickableText(text =jj , onClick = {})

        ll.startActivity(Intent(ll,MainActivity::class.java))


    }}


