package com.example.commons.exception

class UnknownException(message: String? = null, title: String? = null) :
    RuntimeException(message, Throwable(title))
