package com.MuhammadTabish.weatherapp.viewmodel



import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.MuhammadTabish.weatherapp.model.WeatherResponse
import com.MuhammadTabish.weatherapp.repository.WeatherRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel() {
    private val repository = WeatherRepository()

    private val _weatherData = MutableStateFlow<WeatherResponse?>(null)
    val weatherData: StateFlow<WeatherResponse?> = _weatherData

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading

    fun fetchWeather(city: String) {
        viewModelScope.launch {
            _isLoading.value = true
            try {
                _weatherData.value = repository.fetchWeather(city)
            } catch (e: Exception) {
                _weatherData.value = null
            } finally {
                _isLoading.value = false
            }
        }
    }
}