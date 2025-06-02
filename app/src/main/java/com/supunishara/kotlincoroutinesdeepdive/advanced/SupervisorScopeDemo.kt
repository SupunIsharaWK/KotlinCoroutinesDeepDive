package com.supunishara.kotlincoroutinesdeepdive.advanced

import kotlinx.coroutines.*

suspend fun supervisorScopeDemo() = supervisorScope {
    val job1 = launch {
        delay(1000)
        println("Job 1 completed")
    }
    val job2 = launch {
        throw RuntimeException("Job 2 failed")
    }
    job1.join()
}