package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardApp()
        }
    }
}

@Composable
fun BusinessCardApp() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE0F7FA)) // Light blue background
    ) {
        BusinessCard()
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile_picture), // Replace with your image
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .background(Color.White)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Karim TLILI", // Change name
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Text(
            text = "Embedded Developer | Urban Beekeeper",
            fontSize = 16.sp,
            color = Color.DarkGray,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        ContactInfo(phone = "+213 24 635 574", email = "karim.181@yahoo.com")
    }
}

@Composable
fun ContactInfo(phone: String, email: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "📞 $phone", fontSize = 14.sp, color = Color.Black)
        Text(text = "✉️ $email", fontSize = 14.sp, color = Color.Black)
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardApp()
}
