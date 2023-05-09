package com.example.bank.data.api.model

data class Bank(
    val exchangers: List<Exchanger>,
    val serviceId: String,
    val serviceName: String
)