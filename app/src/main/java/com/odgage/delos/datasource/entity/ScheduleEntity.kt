package com.odgage.delos.datasource.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.odgage.delos.domain.model.Schedule
import java.text.SimpleDateFormat
import java.util.*

data class ScheduleEntity(
    @SerializedName("userId") @Expose val userId : Int,
    @SerializedName("startTime") @Expose val startTime : String,
    @SerializedName("endTime") @Expose val endTime : String,
    @SerializedName("name") @Expose val description : String
)

fun ScheduleEntity.mapToDomain() : Schedule{
    val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.KOREA)
    return Schedule(
        this.userId,
        dateFormat.parse(this.startTime),
        dateFormat.parse(this.endTime),
        this.description
    )
}


