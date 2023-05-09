package com.example.bank.screens.first

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bank.R
import com.example.bank.data.api.model.Exchanger
import com.example.bank.databinding.ItemOfBankBinding

class BankAdapter (
    val onClick: (bank: Exchanger)->Unit
): RecyclerView.Adapter<BankAdapter.BankHolder>() {

        private var list= emptyList<Exchanger>()

        inner class BankHolder(item: View): RecyclerView.ViewHolder(item){
            val binding = ItemOfBankBinding.bind(item)

            fun bind (bank:Exchanger) = with(binding){

                Glide.with(binding.root)
                    .load(bank.image)
                    .into(img)
                tvNameBank.text = bank.name
                tvWeb.text=bank.website

                cvItem.setOnClickListener{
                    onClick(list[adapterPosition])
                }
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BankHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_of_bank,parent,false)
            return BankHolder(view)
        }

        override fun getItemCount(): Int {
            return list.size
        }

        override fun onBindViewHolder(holder: BankHolder, position: Int) {
           holder.bind(list[position])
        }
        @SuppressLint("NotifyDataSetChanged")
        fun addBanks(newList: List<Exchanger>){
            list = newList
            notifyDataSetChanged()
        }
    }