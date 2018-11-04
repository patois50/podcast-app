package com.patrickmcgeever.podcastapp

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Application {
    val log = LoggerFactory.getLogger(Application::class.java)

    @Bean
    fun commandLineRunner(ctx: ApplicationContext): CommandLineRunner {
        return CommandLineRunner {
            log.info("Let's inspect the beans provided by Spring Boot:")
            ctx.beanDefinitionNames.asSequence()
                    .sorted()
                    .forEach { beanName -> log.info(beanName) }
        }
    }

}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
