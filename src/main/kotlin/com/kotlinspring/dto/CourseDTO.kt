package com.kotlinspring.dto

import javax.validation.constraints.NotNull

data class CourseDTO(
    val id: Int?,
    val name: String,
    val category: String,
    @get:NotNull(message = "courseDTO.instructorId must not be null")
    val instructorId: Int? = null
)