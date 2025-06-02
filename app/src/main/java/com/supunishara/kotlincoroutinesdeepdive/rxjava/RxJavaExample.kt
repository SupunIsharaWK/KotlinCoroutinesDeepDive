package com.supunishara.kotlincoroutinesdeepdive.rxjava

import io.reactivex.rxjava3.core.Single

fun getUserRx(): Single<String> {
    return Single.just("User from RxJava")
}