package com.example.bank.data.api.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
 class Gbp :Parcelable, Valuta{
    override var buy: String = ""
    override var sel: String =""
    override var name : String = "GBR"
 }