package com.github.maly7.config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConfigClientDemoApplication

fun main(args: Array<String>) {
	runApplication<ConfigClientDemoApplication>(*args)
}
