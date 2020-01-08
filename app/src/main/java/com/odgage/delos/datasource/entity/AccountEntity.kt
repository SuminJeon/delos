package com.odgage.delos.datasource.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.odgage.delos.domain.model.Account
import java.text.SimpleDateFormat
import java.util.*

data class AccountEntity(
    @SerializedName("name") @Expose val name: String,
    @SerializedName("gender") @Expose val gender: String,
    @SerializedName("dateOfBirth") @Expose val dateOfBirth: String,
    @SerializedName("surveyCoin") @Expose val surveyCoin: Int,
    @SerializedName("joinedDate") @Expose val joinedDate: String,
    @SerializedName("isActive") @Expose val isActive: Boolean,
    @SerializedName("isAdmin") @Expose val isAdmin: Boolean
)

fun AccountEntity.mapToDomain(): Account {
    val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.KOREA)
    return Account(
        this.name,
        this.gender,
        dateFormat.parse(this.dateOfBirth),
        this.surveyCoin,
        dateFormat.parse(this.joinedDate),
        this.isActive,
        this.isAdmin
    )
}
