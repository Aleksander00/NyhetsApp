package com.example.nyhetsapp

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.example.nyhetsapp.databinding.FragmentThemeBinding


class ThemeFragment : Fragment() {

    private var _binding: FragmentThemeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentThemeBinding.inflate(inflater, container, false)
        val themeswitch = binding.themeSwitch

        when(context?.resources?.configuration?.uiMode?.and(Configuration.UI_MODE_NIGHT_MASK)) {
            Configuration.UI_MODE_NIGHT_YES -> {themeswitch.toggle()} //Toggles themeswitch if nightmode
        }

        themeswitch.setOnCheckedChangeListener { _, b -> //listener for themeswitch
            darkmodetoggle(b)
        }
        // Inflate the layout for this fragment
        return binding.root
    }

    private fun darkmodetoggle(checked: Boolean) { //Toggles nightmode
        if (checked) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}