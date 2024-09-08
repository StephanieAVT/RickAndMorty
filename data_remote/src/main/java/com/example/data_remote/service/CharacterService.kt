package com.example.data_remote.service

import com.example.data_remote.model.CharacterApiResponse
import com.example.data_remote.model.CharacterResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CharacterService {

    @GET(CHARACTER)
    suspend fun getCharacters(@Query("page") page: Int): Response<CharacterApiResponse>

    companion object {
        const val CHARACTER = "character"
    }
}
