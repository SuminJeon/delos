package com.odgage.delos.domain.model

import java.text.SimpleDateFormat
import java.util.*

data class Group(
    val groupId : Int,
    val name : String,
    val description : String,
    val generatedDate : Date,
    val code : String,
    val memberNum : Int
)