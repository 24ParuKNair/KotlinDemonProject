package com.kotlinTest.KotlinWithMongoDB.Controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sayHello")
class HelloController {
    @GetMapping
    fun helloWorld() : String{
        return "This is rest endpoint using kotlin"
    }
}