package com.example.characters_usecase.repository

import com.example.commons.base.Result
import com.example.characters_usecase.model.CharacterModel
import kotlinx.coroutines.flow.Flow

interface CharactersRepository {
    suspend fun getCharacters(page: Int): Flow<Result<CharacterModel>>
}