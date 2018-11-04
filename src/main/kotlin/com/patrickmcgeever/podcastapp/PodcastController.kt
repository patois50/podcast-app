package com.patrickmcgeever.podcastapp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

data class Greeting(val greeting: String)

@RestController
class PodcastController {

    @GetMapping("/hi")
    fun hi(): Greeting {
        return Greeting("Hi!")
    }

}