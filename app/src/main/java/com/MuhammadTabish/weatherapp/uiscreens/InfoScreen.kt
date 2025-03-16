package com.MuhammadTabish.weatherapp.uiscreens



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InfoScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("About Weather App", color = Color.White) },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color(0xFF1976D2)
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(16.dp))


            Text(
                text = "Weather App",
                color = Color(0xFF1976D2),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(16.dp))


            Text(
                text = "This app provides real-time weather updates for cities around the world. " +
                        "Features include details like temperature, wind speed, cloud coverage, and weather descriptions.",
                fontSize = 16.sp,
                color = Color.Gray,
                lineHeight = 22.sp
            )
            Spacer(modifier = Modifier.height(16.dp))


            Text(
                text = "Powered by: OpenWeatherMap API",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF455A64)
            )
            Spacer(modifier = Modifier.height(8.dp))


            Text(
                text = "Developed by: Muhammad Shafiq Saif",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF455A64)
            )
            Spacer(modifier = Modifier.height(24.dp))


            Button(
                onClick = { navController.navigate("main") },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1976D2))
            ) {
                Text(
                    text = "Back to Main Screen",
                    color = Color.White,
                    fontSize = 16.sp
                )
            }
        }
    }
}