package com.MuhammadTabish.weatherapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.MuhammadTabish.weatherapp.ui.theme.WeatherAppTheme
import com.MuhammadTabish.weatherapp.uiscreens.MainScreen
import com.MuhammadTabish.weatherapp.uiscreens.InfoScreen
import com.MuhammadTabish.weatherapp.viewmodel.WeatherViewModel

class MainActivity : ComponentActivity() {
    private val weatherViewModel = WeatherViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "main"
                ) {
                    composable("main") {
                        MainScreen(viewModel = weatherViewModel, navController = navController)
                    }
                    composable("info") {
                        InfoScreen(navController = navController)
                    }
                }
            }
        }
    }
}