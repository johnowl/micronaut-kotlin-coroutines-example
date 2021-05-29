package com.johnowl

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import org.slf4j.LoggerFactory

@Controller
class IndexController(
    private val indexService: IndexService
) {

    private val logger = LoggerFactory.getLogger(javaClass)

    @Get("/suspend")
    suspend fun getSuspend(): String {
        var counter = 0
        val begin = System.currentTimeMillis()
        for (i in 1..3) {
            logger.info("suspend->execute $i")
            counter += indexService.getSuspend()
            logger.info("suspend->executed $i")
        }
        val end = System.currentTimeMillis()
        return "Executed $counter times in ${(end-begin)/1000} seconds"
    }

    @Get("/")
    fun get(): String {
        var counter = 0
        val begin = System.currentTimeMillis()
        for (i in 1..3) {
            logger.info("suspend->execute $i")
            counter += indexService.get()
            logger.info("suspend->executed $i")
        }
        val end = System.currentTimeMillis()
        return "Executed $counter times in ${(end-begin)/1000} seconds"
    }

}