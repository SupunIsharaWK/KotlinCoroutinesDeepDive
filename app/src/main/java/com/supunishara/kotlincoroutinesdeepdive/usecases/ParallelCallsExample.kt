package com.supunishara.kotlincoroutinesdeepdive.usecases

import kotlinx.coroutines.*

suspend fun parallelApiCalls() = coroutineScope {
    val userDeferred = async { fetchUser() }
    val postsDeferred = async { fetchPosts() }

    val user = userDeferred.await()
    val posts = postsDeferred.await()

    println("User: $user, Posts: $posts")
}

suspend fun fetchUser(): String {
    delay(1000)
    return "UserData"
}

suspend fun fetchPosts(): String {
    delay(1200)
    return "PostData"
}