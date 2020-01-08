package com.odgage.delos.domain.model

import java.util.*

data class Todo(
    val groupBoardId: Int,
    val description: String,
    val generatedDate : Date,
    val dueDate: Date,
    val author: String,
    val personInCharge: List<String>
)