package com.example.bank.screens.first

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bank.data.api.model.Bank
import com.example.bank.data.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class FirstViewModel : ViewModel() {
    private val repo = Repository()

    val myBanks : MutableLiveData<Bank> = MutableLiveData()

    fun getBanks(){
        viewModelScope.launch {
            val m = repo.getBank()
            myBanks.value = m.body()
        }
    }
}