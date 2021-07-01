package com.kotlinTest.KotlinWithMongoDB

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.kotlinTest.*"])
class KotlinWithMongoDbApplication

fun main(args: Array<String>) {
	runApplication<KotlinWithMongoDbApplication>(*args)
	println("I'm working")
}
