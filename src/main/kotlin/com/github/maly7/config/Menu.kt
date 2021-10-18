package com.github.maly7.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
data class Menu(@Value("\${coffee.special:none}") val coffee: String = "")