package com.example.nyhetsapp

import android.os.Bundle
import android.view.*
import android.widget.ListView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.nyhetsapp.databinding.FragmentMainBinding



class MainFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentMainBinding>(inflater,
            R.layout.fragment_main, container, false)
        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.options_menu, menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.account -> {
                view?.findNavController()?.navigate(R.id.action_mainFragment_to_settingsFragment)
                true
            }
            R.id.settings -> {
                view?.findNavController()?.navigate(R.id.action_mainFragment_to_settingsFragment)
                true
            }
            R.id.theme -> {
                view?.findNavController()?.navigate(R.id.action_mainFragment_to_settingsFragment)
                true
            }
            R.id.logout -> {
                view?.findNavController()?.navigate(R.id.action_mainFragment_to_settingsFragment)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}