package com.example.repository.di

import org.koin.dsl.module

val repositoryModule = module {
    single<Ch> { ContactsRepositoryImpl(get(), get()) }
}
