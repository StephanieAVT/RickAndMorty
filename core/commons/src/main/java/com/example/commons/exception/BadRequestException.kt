package com.example.commons.exception

class BadRequestException(message: String? = null, title: String? = null) :
    RuntimeException(message, Throwable(title))
