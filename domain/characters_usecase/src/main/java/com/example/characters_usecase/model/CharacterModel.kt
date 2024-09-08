package com.example.characters_usecase.model


data class CharacterModel(
    val info: InfoModel,
    val results: List<Characters>
)

data class InfoModel(
    val count: Int,
    val pages: Int,
    val next: String?,
    val prev: String?
)

data class Characters(
    val id: Int,
    val name: String,
    val image: String
)
