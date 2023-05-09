package com.example.bank.data.api

import com.example.bank.data.api.model.Bank
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("service/lutsk")
    suspend fun getBanks():Response<Bank>
}