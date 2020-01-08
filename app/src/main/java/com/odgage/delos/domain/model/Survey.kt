package com.odgage.delos.domain.model

import java.util.*

data class Survey(
    val userId : Int,
    val targetGender : String,
    val targetAgeStart : String,
    val targetAgeEnd : String,
    val generatedDate : Date,
    val editedDate : Date,
    val usedCoin : Int,
    val answerNum : Int,
    val isActive : Boolean
)