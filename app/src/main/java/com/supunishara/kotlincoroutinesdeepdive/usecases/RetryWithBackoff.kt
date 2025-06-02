package com.supunishara.kotlincoroutinesdeepdive.usecases

import kotlinx.coroutines.*

suspend fun retryWithBackoff(retries: Int = 3, block: suspend () -> Unit) {
    var currentDelay = 1000L
    repeat(retries) { attempt ->
        try {
            block()
            return
        } catch (e: Exception) {
            println("Attempt ${attempt + 1} failed: ${e.message}")
        }
        delay(currentDelay)
        currentDelay *= 2
    }
}