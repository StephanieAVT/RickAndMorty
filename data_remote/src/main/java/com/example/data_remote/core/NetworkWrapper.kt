@file:Suppress("SwallowedException")

package com.example.data_remote.core

import com.example.commons.exception.BadRequestException
import com.example.commons.exception.NotFoundException
import com.example.commons.exception.UnauthorizedException
import com.example.commons.exception.UnknownException
import retrofit2.Response

class NetworkWrapper {
    companion object StatusCode {
        const val BAD_REQUEST = 400
        const val NOT_AUTHORIZED = 401
        const val NOT_FOUND = 404
    }

    suspend operator fun <T> invoke(call: suspend () -> Response<T>): T =
        call().let { result ->
            return when {
                result.isSuccessful.not() -> throw handleExceptionByCode(result)
                else -> result.body() ?: throw UnknownException()
            }
        }

    private fun handleExceptionByCode(response: Response<*>): Exception {
        when (response.code()) {
            BAD_REQUEST -> throw BadRequestException()
            NOT_FOUND -> throw NotFoundException()
            NOT_AUTHORIZED -> throw UnauthorizedException()
            else -> throw UnknownException()
        }
    }
}
