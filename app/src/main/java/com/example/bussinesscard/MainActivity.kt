package com.example.bussinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bussinesscard.ui.theme.BussinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.onBackground
                ) {
                    BussinessCard()
                }
            }
        }
    }
}

@Composable
fun BussinessCard() {
        Column(
            modifier = Modifier.fillMaxHeight().fillMaxWidth().background(Color(0Xffffffff)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )
        {
            val image = painterResource(id = R.drawable.android_logo)
            Image(
                painter = image, contentDescription = "Android Logo",
                modifier = Modifier.height(120.dp).width(150.dp)
            )
            Text(text = "vara.eugene", color = Color.Black, fontSize = 32.sp)
            Text(text = "Android Developer", color = Color(0xFF3ddc84))
        }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 50.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start
    )
    {
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
        ) {
            val phone = painterResource(id = R.drawable.ic_phone)
            Image(painter = phone, contentDescription = null, modifier = Modifier.padding(8.dp))
            Text(
                text = "+1(1) 999 999 999",
                color = Color.Black,
                modifier = Modifier.padding(8.dp)
            )

        }
        Spacer(modifier = Modifier.height(1.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
        ) {
            val share = painterResource(id = R.drawable.ic_share2)
            Image(painter = share, contentDescription = null, modifier = Modifier.padding(8.dp))
            Text(
                text = "@AndroidDeveloper",
                color = Color.Black,
                modifier = Modifier.padding(8.dp)
            )

        }
        Spacer(modifier = Modifier.height(1.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
        ) {
            val email = painterResource(id = R.drawable.ic_email)
            Image(painter = email, contentDescription = null, modifier = Modifier.padding(8.dp))
            Text(
                text = "vara.eugene@android.com",
                color = Color.Black,
                modifier = Modifier.padding(8.dp)
            )

        }
    }
}




@Preview(showBackground = true,showSystemUi=true)
@Composable
fun DefaultPreview() {
    BussinessCardTheme {
        BussinessCard()
    }
}