package com.example.repository.repository

import com.example.commons.base.Result
import com.example.characters_usecase.model.CharacterModel
import com.example.characters_usecase.repository.CharactersRepository
import com.example.repository.datasource.remote.CharactersRemoteDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class CharactersRepositoryImpl(
    private val charactersRemoteDataSource: CharactersRemoteDataSource
): CharactersRepository {
    override suspend fun getCharacters(page: Int): Flow<Result<CharacterModel>> = flow {
        charactersRemoteDataSource.getCharacters(page).let {
            when (it) {
                is Result.Success -> {
                    emit(it)
                }
                is Result.Failure -> emit(Result.Failure(it.exception))
            }
        }
    }
}