package com.example.bintesttask.data

import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("numeric") val numeric: String? = null,
    @SerializedName("alpha2") val alpha2: String? = null,
    @SerializedName("name") val name: String? = null,
    @SerializedName("emoji") val emoji: String? = null,
    @SerializedName("currency") val currency: String? = null,
    @SerializedName("latitude") val latitude: Int? = null,
    @SerializedName("longitude") val longitude: Int? = null
)
