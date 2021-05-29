package com.johnowl

import kotlinx.coroutines.delay
import java.lang.Thread.sleep
import javax.inject.Singleton

@Singleton
class IndexService {

    suspend fun getSuspend(): Int {
        delay(1000)
        return 1
    }

    fun get(): Int {
        sleep(1000)
        return 1
    }

}