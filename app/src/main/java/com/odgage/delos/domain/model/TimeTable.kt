package com.odgage.delos.domain.model

import java.text.SimpleDateFormat

data class TimeTable(
    val author: String,
    val title: String,
    val location: String,
    val day: String,
    val start_time: SimpleDateFormat,
    val end_time: SimpleDateFormat
)