package com.example.repository.di

import com.example.characters_usecase.repository.CharactersRepository
import com.example.repository.repository.CharactersRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<CharactersRepository> { CharactersRepositoryImpl(get()) }
}
