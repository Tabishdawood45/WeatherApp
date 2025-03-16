package com.MuhammadTabish.weatherapp.model



data class WeatherResponse(
    val name: String,
    val main: Main,
    val weather: List<Weather>,
    val wind: Wind,
    val clouds: Clouds
)

data class Main(
    val temp: Float
)

data class Weather(
    val description: String
)

data class Wind(
    val speed: Float
)

data class Clouds(
    val all: Int
)