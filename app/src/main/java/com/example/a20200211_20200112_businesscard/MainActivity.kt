package com.example.a20200211_20200112_businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a20200211_20200112_businesscard.ui.theme._20200211_20200112_BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _20200211_20200112_BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize()) {

                }
            }
        }
    }
}

@Composable
fun businessCard(name: String, charge: String, phone: String, shared: String, email: String, backgroundColor: Color){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
    ){
        topInformation(name, charge)
        contactInformation(phone, shared, email)
    }
}


@Composable
fun topInformation(name: String, charge: String){
    var image = painterResource(R.drawable.android_logo)
    Column(
        modifier = Modifier
            .padding(top = 250.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ){
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .height(120.dp)
                .width(150.dp)
                .background(Color(0XFF073042))
        )
        Text(
            text = name,
            fontSize = 40.sp
        )
        Text(
            text = charge,
            color = Color(0xFF1C7A4B)
        )

    }
}

@Composable
fun contactInformation(phone: String, shared: String, email: String){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 250.dp)
            .padding(bottom = 70.dp)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth().padding(start = 40.dp)
        ){
            val icon = painterResource(id = R.drawable.ic_baseline_local_phone_24)
            Icon(painter = icon,
                contentDescription = null,
                modifier = Modifier.padding(start = 60.dp),
                Color(0xFF006D3B)
            )
            Text(
                modifier = Modifier.padding(start = 20.dp),
                text = phone
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth().padding(start = 40.dp)
        ){
            val icon = painterResource(id = R.drawable.ic_baseline_share_24)
            Icon(painter = icon,
                contentDescription = null,
                modifier = Modifier.padding(start = 60.dp),
                Color(0xFF006D3B)
            )
            Text(
                modifier = Modifier.padding(start = 20.dp),
                text = shared
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth().padding(start = 40.dp)
        ){
            val icon = painterResource(id = R.drawable.ic_baseline_email_24)
            Icon(painter = icon,
                contentDescription = null,
                modifier = Modifier.padding(start = 60.dp),
                Color(0xFF006D3B)
            )
            Text(
                modifier = Modifier.padding(start = 20.dp),
                text = email
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _20200211_20200112_BusinessCardTheme {
        businessCard("Jennifer Doe", "Android Developer Extraordinaire", "+11 (123) 444 555 666", "@AndroidDev", "jen.doe@android.com", Color(0xFFD2E8D4))
    }
}