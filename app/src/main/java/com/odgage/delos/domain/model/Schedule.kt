package com.odgage.delos.domain.model

import java.text.SimpleDateFormat
import java.util.*

data class Schedule(
    val userId : Int,
    val startTime : Date,
    val endTime : Date,
    val description : String
)