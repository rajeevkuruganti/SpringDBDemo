package com.fourcircles.springdbdemo.controllers

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "person")
data class Person (
    @Id
    val id: Long,
    @Column
    val name: String,
    @Column
    val email: String,
    @Column
    val city: String,
    @Column
    val country: String
){

}
