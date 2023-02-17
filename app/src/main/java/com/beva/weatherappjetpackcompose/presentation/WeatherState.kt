package com.beva.weatherappjetpackcompose.presentation

import com.beva.weatherappjetpackcompose.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
