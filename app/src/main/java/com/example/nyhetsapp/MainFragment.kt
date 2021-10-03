package com.example.nyhetsapp

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import com.example.nyhetsapp.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        //(activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true) //Removes up button for this fragment
        (activity as AppCompatActivity).supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24) //Changes up button icon with drawer icon
        setHasOptionsMenu(true) //Adds option menu

        // Inflate the layout for this fragment
        return binding.root
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.option_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.option_account -> {
                view?.findNavController()?.navigate(R.id.action_mainFragment_to_accountFragment)
                true
            }
            R.id.option_settings -> {
                view?.findNavController()?.navigate(R.id.action_mainFragment_to_settingsFragment)
                true
            }
            R.id.options_theme -> {
                view?.findNavController()?.navigate(R.id.action_mainFragment_to_themeFragment)
                true
            }
            R.id.option_logout -> {
                view?.findNavController()?.navigate(R.id.action_mainFragment_to_startFragment)
                true
            }
            android.R.id.home -> { //Overwrites up button
                if (binding.drawerLayout.isOpen) {
                    binding.drawerLayout.closeDrawer(GravityCompat.START)
                } else {
                    binding.drawerLayout.openDrawer(GravityCompat.START)
                }
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}