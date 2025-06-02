package com.supunishara.kotlincoroutinesdeepdive.rxjava

import kotlinx.coroutines.*

suspend fun getUserCoroutine(): String {
    delay(1000)
    return "User from Coroutine"
}