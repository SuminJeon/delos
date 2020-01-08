package com.odgage.delos.datasource.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.odgage.delos.domain.model.Todo
import java.text.SimpleDateFormat
import java.util.*

data class TodoEntity(
    @SerializedName("groupBoardId") @Expose val groupBoardId: Int,
    @SerializedName("description") @Expose val description: String,
    @SerializedName("generatedDate") @Expose val generatedDate: String,
    @SerializedName("dueDate") @Expose val dueDate: String,
    @SerializedName("author") @Expose val author: String,
    @SerializedName("personInCharge") @Expose val personInCharge: List<String>
)

fun TodoEntity.mapToDomain(): Todo {
    val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.KOREA)

    return Todo(
        this.groupBoardId,
        this.description,
        dateFormat.parse(this.generatedDate),
        dateFormat.parse(this.dueDate),
        this.author,
        this.personInCharge
    )

}