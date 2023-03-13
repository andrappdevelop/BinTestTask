package com.example.bintesttask.data

import com.google.gson.annotations.SerializedName

data class BinCloud(
    @SerializedName("number") val number: Number? = Number(),
    @SerializedName("scheme") val scheme: String? = null,
    @SerializedName("type") val type: String? = null,
    @SerializedName("brand") val brand: String? = null,
    @SerializedName("prepaid") val prepaid: Boolean? = null,
    @SerializedName("country") val country: Country? = Country(),
    @SerializedName("bank") val bank: Bank? = Bank()
)