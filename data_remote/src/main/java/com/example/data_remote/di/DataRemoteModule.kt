package com.example.data_remote.di

import com.example.data_remote.core.ConverterFactoryProvider
import com.example.data_remote.core.NetworkConnection
import com.example.data_remote.core.Retrofit
import com.example.data_remote.datasource.CharactersRemoteDataSource
import com.example.data_remote.service.CharacterService
import org.koin.dsl.module
import retrofit2.Converter

val dataRemoteModule = module {
    single<Converter.Factory> { ConverterFactoryProvider() }


    single<CharacterService> {
        Retrofit(
            converterFactory = get(),
            baseUrl = NetworkConnection.BASE_URL,
        )
    }

    single<CharactersRemoteDataSource> { CharactersRemoteDataSourceImpl(get()) }
}
