package com.example.bank.screens.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bank.R
import com.example.bank.data.api.model.Exchanger
import com.example.bank.data.api.model.Rates
import com.example.bank.data.api.model.Valuta
import com.example.bank.databinding.ItemOfBankBinding
import com.example.bank.databinding.ItemOfRetesBinding

class InfoAdapter (): RecyclerView.Adapter<InfoAdapter.RatersHolder>() {

        private var list= emptyList<Valuta>()

        inner class RatersHolder(item: View): RecyclerView.ViewHolder(item){
            val binding = ItemOfRetesBinding.bind(item)

            fun bind (rate:Valuta) = with(binding){
                tvBuy.text = rate.buy
                tvSell.text=rate.sel
                tvNameRates.text=rate.name
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RatersHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_of_retes,parent,false)
            return RatersHolder(view)
        }

        override fun getItemCount(): Int {
            return list.size
        }

        override fun onBindViewHolder(holder: RatersHolder, position: Int) {
           holder.bind(list[position])
        }
        @SuppressLint("NotifyDataSetChanged")
        fun addRates(newList: List<Valuta>){
            list = newList
            notifyDataSetChanged()
        }
    }