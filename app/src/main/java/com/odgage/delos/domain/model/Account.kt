package com.odgage.delos.domain.model

import java.util.*

data class Account(
    val name: String,
    val gender: String,
    val dateOfBirth: Date,
    val surveyCoin: Int,
    val joinedDate: Date,
    val isActive: Boolean,
    val isAdmin: Boolean
)