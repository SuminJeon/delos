package com.odgage.delos.domain.model

import java.text.SimpleDateFormat
import java.util.*

data class Notice(
    val noticeId : Int,
    val groupId : Int,
    val description : String,
    val generatedDate : Date,
    val author : String
)