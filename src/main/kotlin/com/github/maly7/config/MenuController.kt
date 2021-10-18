package com.github.maly7.config

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class MenuController(val storeMenu: Menu) {

    @GetMapping("/menu/coffee")
    fun getMenu(): Mono<String> = Mono.just("The coffee special of the day is ${storeMenu.coffee}")
}