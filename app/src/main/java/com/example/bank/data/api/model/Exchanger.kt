package com.example.bank.data.api.model

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
@Parcelize
data class Exchanger(
    var background: String,
    val border: String,
    val id: String,
    val image: String,
    val name: String,
    val rates: Rates,
    val serviceId: String,
    val slug: String,
    val website: String
):Parcelable