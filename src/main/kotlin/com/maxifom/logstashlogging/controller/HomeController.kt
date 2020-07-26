package com.maxifom.logstashlogging.controller

import net.logstash.logback.argument.StructuredArguments.kv
import net.logstash.logback.argument.StructuredArguments.v
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    private val logger: Logger = LoggerFactory.getLogger(javaClass)

    @GetMapping("/")
    fun get(): Map<String, String> {

        logger.info("Request with kv", kv("path", "/"))
        logger.info("Request with kv {}", kv("path", "/"))
        logger.info("Request with v", v("path", "/"))
        logger.info("Request with v {}", v("path", "/"))
        return mapOf("hello" to "world")
    }
}