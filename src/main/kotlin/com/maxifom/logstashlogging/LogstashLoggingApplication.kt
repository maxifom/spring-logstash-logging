package com.maxifom.logstashlogging

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LogstashLoggingApplication

fun main(args: Array<String>) {
	runApplication<LogstashLoggingApplication>(*args)
}
