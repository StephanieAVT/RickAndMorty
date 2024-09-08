package com.example.data_remote.datasource

import com.example.data_remote.Stub.CHARACTER_MODEL
import com.example.data_remote.Stub.CHARACTER_RESPONSE
import com.example.data_remote.core.NetworkWrapper
import com.example.commons.base.Result
import com.example.commons.exception.UnknownException
import com.example.data_remote.model.CharacterApiResponse
import com.example.data_remote.service.CharacterService
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.koin.core.context.GlobalContext
import org.koin.dsl.module

class CharactersRemoteDataSourceImplTest {

    private lateinit var dataSource: CharactersRemoteDataSourceImpl

    private val characterService: CharacterService = mockk()

    private val networkWrapper: NetworkWrapper = mockk()

    private val testModule = module {
        single { networkWrapper }
    }

    @Before
    fun setup() {
        GlobalContext.startKoin { modules(testModule) }
        MockKAnnotations.init()
        dataSource = CharactersRemoteDataSourceImpl(characterService)
    }

    @After
    fun reset() {
        GlobalContext.stopKoin()
    }

    @Test
    fun `WHEN getCharacters HAS success MUST return a result data mapped`(): Unit =
        runBlocking {
            coEvery { networkWrapper<CharacterApiResponse>(any()) } returns CHARACTER_RESPONSE

            val result = dataSource.getCharacters(1)

            Assert.assertEquals(result, Result.Success(CHARACTER_MODEL))
        }

    @Test
    fun `WHEN getCharacters HAS failure MUST throw a exception`(): Unit =
        runBlocking {
            val error = UnknownException()
            coEvery { networkWrapper<CharacterApiResponse>(any()) } throws error

            val result = dataSource.getCharacters(1)

            Assert.assertEquals(result, Result.Failure(error))
        }
}