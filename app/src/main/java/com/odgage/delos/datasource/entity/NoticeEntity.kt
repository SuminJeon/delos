package com.odgage.delos.datasource.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.odgage.delos.domain.model.Notice
import java.text.SimpleDateFormat
import java.util.*

data class NoticeEntity(
    @SerializedName("noticeId") @Expose val noticeId: Int,
    @SerializedName("groupId") @Expose val groupId: Int,
    @SerializedName("description") @Expose val description: String,
    @SerializedName("generatedDate") @Expose val generatedDate: String,
    @SerializedName("author") @Expose val author: String
)

fun NoticeEntity.mapToDomain(): Notice {
    val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.KOREA)

    return Notice(
        this.noticeId,
        this.groupId,
        this.description,
        dateFormat.parse(this.generatedDate),
        this.author
    )
}
