package com.example.data_remote

import com.example.characters_usecase.model.CharacterModel
import com.example.characters_usecase.model.Characters
import com.example.characters_usecase.model.InfoModel
import com.example.data_remote.model.CharacterApiResponse
import com.example.data_remote.model.CharacterResponse
import com.example.data_remote.model.InfoResponse

object Stub {
    val CHARACTER_RESPONSE = CharacterApiResponse(
        info = InfoResponse(
            count = 1,
            pages = 1,
            next = null,
            prev = null
        ),
        results = listOf(
            CharacterResponse(
                id = 1,
                name = "Jonh Doe",
                status = "Alive",
                species = "Human",
                type = "",
                gender = "Male",
                image = "",
                url = "",
                created = "",
            )
        )
    )

    val CHARACTER_MODEL = CharacterModel(
        info = InfoModel(
            count = 1,
            pages = 1,
            next = null,
            prev = null
        ),
        results = listOf(
            Characters(
                id = 1,
                name = "Jonh Doe",
                image = ""
            )
        )
    )
}
