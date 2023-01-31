package ru.netology.nmedia

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class NMediaApplication

fun main(args: Array<String>) {
    runApplication<NMediaApplication>(*args)
}