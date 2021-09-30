package com.example.nyhetsapp

import android.os.Bundle
import android.view.*
import android.widget.ListView
import android.widget.TableLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.nyhetsapp.adapters.ViewPagerAdapter
import com.example.nyhetsapp.databinding.FragmentMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentMainBinding>(inflater,
            R.layout.fragment_main, container, false)
        setHasOptionsMenu(true)
/*
        val tabLayout=requireView().findViewById<TabLayout>(R.id.tab_layout)
        val viewPager2=requireView().findViewById<ViewPager2>(R.id.view_pager_2)

        val adapter= ViewPagerAdapter(childFragmentManager, lifecycle)
        viewPager2.adapter=adapter

        TabLayoutMediator(tabLayout, viewPager2){tab,position->
            when(position) {
                0->{
                    tab.text="First"
                }
                1->{
                    tab.text="Second"
                }
                2->{
                    tab.text="Third"
                }
            }
        }.attach()*/

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