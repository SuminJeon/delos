package com.odgage.delos.datasource.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.odgage.delos.domain.model.Survey
import java.text.SimpleDateFormat
import java.util.*

data class SurveyEntity(
    @SerializedName("userId") @Expose val userId: Int,
    @SerializedName("targetGender") @Expose val targetGender: String,
    @SerializedName("targetAgeStart") @Expose val targetAgeStart: String,
    @SerializedName("targetAgeEnd") @Expose val targetAgeEnd: String,
    @SerializedName("generatedDate") @Expose val generatedDate: String,
    @SerializedName("editedDate") @Expose val editedDate: String,
    @SerializedName("usedCoin") @Expose val usedCoin: Int,
    @SerializedName("answerNum") @Expose val answerNum: Int,
    @SerializedName("isActive") @Expose val isActive: Boolean
)

fun SurveyEntity.mapToDomain(): Survey {
    val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.KOREA)

    return Survey(
        this.userId,
        this.targetGender,
        this.targetAgeStart,
        this.targetAgeEnd,
        dateFormat.parse(this.generatedDate),
        dateFormat.parse(this.editedDate),
        this.usedCoin,
        this.answerNum,
        this.isActive
    )
}
