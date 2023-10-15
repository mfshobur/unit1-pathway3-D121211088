package com.example.tugas1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas1.ui.theme.Tugas1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tugas1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
                    color = Color(0xFFd2e8d4)
                ) {
                    BusinessCardPreview()
                }
            }
        }
    }
}

@Composable
fun MiddlePart() {
    val image = painterResource(id = R.drawable.android_logo)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier.background(Color(0xFF073042))
        ) {
            Image(painter = image, contentDescription = null, modifier = Modifier.size(160.dp))
        }
        Text(text = "Muh. Shobur Fattah", fontSize = 30.sp, modifier = Modifier.padding(top = 16.dp))
        Text(text = "Android Developer Extraordinaire", fontSize = 16.sp, fontWeight = FontWeight.SemiBold, color = Color(0xFF006833), modifier = Modifier.padding(top = 8.dp))
    }
}

@Composable
fun DataRow(text: String, icon: ImageVector, modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .padding(top = 16.dp)
    ) {
        Icon(imageVector = icon, contentDescription = null, modifier = Modifier.size(25.dp), tint = Color(0xFF006833))
        Text(text = text, fontSize = 20.sp, modifier = Modifier.padding(start = 10.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    Tugas1Theme {
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            
        MiddlePart()
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .padding(top = 200.dp, bottom = 50.dp)
            ) {
                DataRow(text = stringResource(R.string.phone_number), icon = Icons.Default.Call)
                DataRow(text = "@mfshobur", icon = Icons.Default.Share)
                DataRow(text = "mfshobur@gmail.com", icon = Icons.Default.Email)
            }
        }
    }
}