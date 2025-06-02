package com.supunishara.kotlincoroutinesdeepdive.basics

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class UserViewModel : ViewModel() {
    fun fetchUser() {
        viewModelScope.launch {
            val user = getUserFromRepository()
            println("User: $user")
        }
    }

    private suspend fun getUserFromRepository(): String {
        delay(1000)
        return "Sample User"
    }
}