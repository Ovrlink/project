package com.example.bank.data.repository

import com.example.bank.data.api.RetrofitInstance
import com.example.bank.data.api.model.Bank
import retrofit2.Response

class Repository {
    suspend fun getBank(): Response<Bank>{
        return RetrofitInstance.api.getBanks()
    }
}