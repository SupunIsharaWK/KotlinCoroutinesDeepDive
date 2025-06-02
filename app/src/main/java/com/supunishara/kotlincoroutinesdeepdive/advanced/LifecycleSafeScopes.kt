package com.supunishara.kotlincoroutinesdeepdive.advanced

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

fun LifecycleOwner.launchInLifecycleScope() {
    lifecycleScope.launch {
        println("Running in lifecycleScope")
    }
}