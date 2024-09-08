package com.example.data_remote.datasource

import com.example.characters_usecase.model.CharacterModel
import com.example.commons.base.Result
import com.example.commons.base.runCatchingResult
import com.example.data_remote.core.NetworkWrapper
import com.example.data_remote.mapper.mapToDomain
import com.example.data_remote.service.CharacterService
import com.example.repository.datasource.remote.CharactersRemoteDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class CharactersRemoteDataSourceImpl(
    private val characterService: CharacterService
) : CharactersRemoteDataSource, KoinComponent {
    private val networkWrapper: NetworkWrapper by inject()

    override suspend fun getCharacters(page: Int): Result<CharacterModel> = runCatchingResult {
        networkWrapper { characterService.getCharacters(page) }.mapToDomain()
    }
}