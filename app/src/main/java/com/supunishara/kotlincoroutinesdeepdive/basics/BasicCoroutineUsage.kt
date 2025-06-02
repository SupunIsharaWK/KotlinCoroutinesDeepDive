package com.supunishara.kotlincoroutinesdeepdive.basics

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Start")
    launch {
        delay(1000)
        println("Hello from coroutine!")
    }
    println("End")
}