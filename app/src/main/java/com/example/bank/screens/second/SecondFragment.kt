package com.example.bank.screens.second

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.bank.R
import com.example.bank.data.api.model.Exchanger
import com.example.bank.data.api.model.Valuta
import com.example.bank.databinding.FragmentFisrtBinding
import com.example.bank.databinding.FragmentSecondBinding
import java.net.URI

class SecondFragment : Fragment(R.layout.fragment_second) {

    private val args: SecondFragmentArgs by navArgs()
    private lateinit var adapter: InfoAdapter
    private lateinit var binding: FragmentSecondBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)
        val info = args.info
        binding.tvNameOfBank.text = info.name
        Glide.with(binding.root)
            .load(info.image)
            .into(binding.image)

        binding.tvWebSite.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse(info.website))
            startActivity(i)
        }

        val rate = info.rates
        val list = listOf<Valuta>(
            rate.eur, rate.usd, rate.pln, rate.gbp, rate.chf)
        adapter = InfoAdapter().also {
            it.addRates(list)
        }
        binding.rcRates.adapter =adapter
    }
}