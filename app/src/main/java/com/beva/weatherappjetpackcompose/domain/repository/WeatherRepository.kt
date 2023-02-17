package com.beva.weatherappjetpackcompose.domain.repository

import com.beva.weatherappjetpackcompose.domain.util.Resource
import com.beva.weatherappjetpackcompose.domain.weather.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>

}