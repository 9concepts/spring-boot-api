package com.kotlinspring.util

import com.kotlinspring.entity.Course
import com.kotlinspring.entity.Instructor

fun courseEntityList() = listOf(
    Course(null, "Build Restful APIs using SpringBoot and Kotlin", "Development"),
    Course(null, "Build Reactive Microservices using Spring WebFlux/SpringBoot", "Development"),
    Course(null, "Wiremock for Java Developers", "Development")
)

fun courseEntityList(instructor: Instructor? = null) = listOf(
    Course(null, "Build Restful APIs using SpringBoot and Kotlin", "Development", instructor),
    Course(null, "Build Reactive Microservices using Spring WebFlux/SpringBoot", "Development", instructor),
    Course(null, "Wiremock for Java Developers", "Development", instructor)
)

fun instructorEntity(name: String = "Dilip Sundarraj") = Instructor(null, name)