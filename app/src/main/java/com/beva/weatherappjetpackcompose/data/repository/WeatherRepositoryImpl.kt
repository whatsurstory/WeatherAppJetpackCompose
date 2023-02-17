package com.beva.weatherappjetpackcompose.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import com.beva.weatherappjetpackcompose.data.mappers.toWeatherInfo
import com.beva.weatherappjetpackcompose.data.remote.WeatherApi
import com.beva.weatherappjetpackcompose.domain.repository.WeatherRepository
import com.beva.weatherappjetpackcompose.domain.util.Resource
import com.beva.weatherappjetpackcompose.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi): WeatherRepository {

    @RequiresApi(Build.VERSION_CODES.O)
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch (e:Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "UnKnown Error Occurred")
        }
    }
}