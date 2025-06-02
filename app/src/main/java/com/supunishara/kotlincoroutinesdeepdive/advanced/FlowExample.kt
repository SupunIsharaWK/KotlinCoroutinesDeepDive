package com.supunishara.kotlincoroutinesdeepdive.advanced

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun fetchUserFlow(): Flow<String> = flow {
    emit("User 1")
    delay(500)
    emit("User 2")
}

suspend fun collectUserFlow() {
    fetchUserFlow().collect { user ->
        println("Collected: $user")
    }
}