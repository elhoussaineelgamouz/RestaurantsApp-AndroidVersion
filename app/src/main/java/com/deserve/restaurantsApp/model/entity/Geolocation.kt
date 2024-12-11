package com.deserve.restaurantsApp.model.entity

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

data class Geolocation(
    val latitude: Double,
    val longitude: Double
)