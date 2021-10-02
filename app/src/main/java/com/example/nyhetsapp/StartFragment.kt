package com.example.nyhetsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.nyhetsapp.databinding.FragmentStartBinding


class StartFragment : Fragment() {

    private var _binding: FragmentStartBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentStartBinding.inflate(inflater, container, false)


        binding.login.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_startFragment_to_loginFragment)
        }
        binding.register.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_startFragment_to_registerFragment)
        }
        binding.skip.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_startFragment_to_mainFragment)
        }


        return binding.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}