package com.example.nyhetsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.nyhetsapp.databinding.FragmentAccountBinding


class AccountFragment : Fragment() {

    private var _binding: FragmentAccountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAccountBinding.inflate(inflater, container, false)
        binding.backBtn.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_accountFragment_to_mainFragment)
        }
        binding.logoutBtn.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_accountFragment_to_startFragment)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}