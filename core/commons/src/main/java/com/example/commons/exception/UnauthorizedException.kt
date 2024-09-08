package com.example.commons.exception

class UnauthorizedException(message: String? = null, title: String? = null) :
    RuntimeException(message, Throwable(title))
