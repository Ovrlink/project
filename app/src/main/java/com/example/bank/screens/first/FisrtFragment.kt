package com.example.bank.screens.first

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.bank.R
import com.example.bank.data.api.model.Exchanger
import com.example.bank.databinding.FragmentFisrtBinding
import com.example.bank.screens.second.SecondFragment

class FisrtFragment : Fragment(R.layout.fragment_fisrt) {
    private lateinit var binding: FragmentFisrtBinding
    private   var adapterBanks= BankAdapter(::toSecond)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFisrtBinding.bind(view)

//        adapterBanks = BankAdapter {
//            findNavController().navigate(
//                R.id.action_fisrtFragment_to_secondFragment
//              //  bundleOf(S.BAKE to it)
//            )
//        }
        binding.rvBanks.adapter = adapterBanks

        val viewModel = ViewModelProvider(this).get(FirstViewModel::class.java)
        viewModel.getBanks()

        viewModel.myBanks.observe(viewLifecycleOwner){ bank->
            adapterBanks.addBanks(bank.exchangers)
        }
        }
    fun toSecond(bank: Exchanger){
        val action = FisrtFragmentDirections.actionFisrtFragmentToSecondFragment(bank)
        findNavController().navigate(action)
    }
    }