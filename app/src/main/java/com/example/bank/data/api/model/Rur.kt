package com.example.bank.data.api.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Rur(
    val buy: String,
    val sel: String
): Parcelable