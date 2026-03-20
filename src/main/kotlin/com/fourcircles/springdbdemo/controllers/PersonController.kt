package com.fourcircles.springdbdemo.controllers


import com.fourcircles.springdbdemo.repos.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/person")
class PersonController () {
    @Autowired
    lateinit var personRepository: PersonRepository
    @GetMapping("/info")
    fun appInfo() : String {
        return "Hello, You did it again! You deployed a flyway database Spring Boot app!"
    }
    @GetMapping("/db")
    fun dbInfo() : MutableIterable<Person> {
          return personRepository.findAll()
    }



}