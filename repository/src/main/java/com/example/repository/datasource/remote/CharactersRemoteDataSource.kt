package com.example.repository.datasource.remote

import com.example.commons.base.Result
import com.example.characters_usecase.model.CharacterModel
import kotlinx.coroutines.flow.Flow

interface CharactersRemoteDataSource {
    suspend fun getCharacters(page: Int): Result<CharacterModel>
}