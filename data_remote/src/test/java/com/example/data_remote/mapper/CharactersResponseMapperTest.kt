package com.example.data_remote.mapper

import com.example.data_remote.Stub.CHARACTER_MODEL
import com.example.data_remote.Stub.CHARACTER_RESPONSE
import org.junit.Assert
import org.junit.Test

class CharactersResponseMapperTest{

        @Test
        fun `Assert Characters is mapping`() {
            Assert.assertEquals(CHARACTER_RESPONSE.mapToDomain(), CHARACTER_MODEL)
        }
}