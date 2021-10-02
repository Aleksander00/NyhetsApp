package com.example.nyhetsapp

import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.nyhetsapp.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(false) //Removes up button for this fragment
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
            else -> super.onOptionsItemSelected(item)
        }
    }
   override fun onDestroyView() {
       super.onDestroyView()
       _binding = null
   }
}