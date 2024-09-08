package com.example.data_remote.mapper

import com.example.characters_usecase.model.CharacterModel
import com.example.characters_usecase.model.Characters
import com.example.characters_usecase.model.InfoModel
import com.example.data_remote.model.CharacterApiResponse
import com.example.data_remote.model.CharacterResponse
import com.example.data_remote.model.InfoResponse

fun CharacterApiResponse.mapToDomain() =
    CharacterModel(info = info.mapToDomain(), results = results.map { it.mapToDomain() })

fun InfoResponse.mapToDomain() = InfoModel(
    count = count,
    pages = pages,
    next = next,
    prev = prev
)
fun List<CharacterResponse>.mapToDomain() = map { it.mapToDomain() }

fun CharacterResponse.mapToDomain() = Characters(
    id = id,
    name = name,
    image = image
)
