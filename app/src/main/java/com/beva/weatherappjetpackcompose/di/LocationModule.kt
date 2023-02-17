package com.beva.weatherappjetpackcompose.di

import com.beva.weatherappjetpackcompose.data.location.DefaultLocationTracker
import com.beva.weatherappjetpackcompose.data.repository.WeatherRepositoryImpl
import com.beva.weatherappjetpackcompose.domain.location.LocationTracker
import com.beva.weatherappjetpackcompose.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton


@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract class LocationModule {

    @Binds
    @Singleton
    abstract fun bindLocationTracker(defaultLocationTracker: DefaultLocationTracker): LocationTracker
}