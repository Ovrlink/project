package com.example.bank.data.api.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Rates(
    val chf: Chf,
    val eur: Eur,
    val exchangerId: String,
    val gbp: Gbp,
    val pln: Pln,
    val rur: Rur,
    val updateTime: Int,
    val usd: Usd
): Parcelable