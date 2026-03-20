package com.fourcircles.springdbdemo.repos

import com.fourcircles.springdbdemo.controllers.Person
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository: CrudRepository<Person, Long>