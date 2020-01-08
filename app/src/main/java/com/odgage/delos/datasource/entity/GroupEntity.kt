package com.odgage.delos.datasource.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.odgage.delos.domain.model.Group
import java.text.SimpleDateFormat
import java.util.*

data class GroupEntity(
    @SerializedName("groupId") @Expose val groupId: Int,
    @SerializedName("name") @Expose val name: String,
    @SerializedName("description") @Expose val description: String,
    @SerializedName("generatedDate") @Expose val generatedDate: String,
    @SerializedName("code") @Expose val code: String,
    @SerializedName("memberNum") @Expose val memberNum: Int
)

fun GroupEntity.mapToDomain(): Group {
    val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.KOREA)
    return Group(
        this.groupId,
        this.name,
        this.description,
        dateFormat.parse(this.generatedDate),
        this.code,
        this.memberNum
    )
}
