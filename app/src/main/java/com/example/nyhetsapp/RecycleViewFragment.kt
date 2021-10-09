package com.example.nyhetsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class RecycleViewFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_recycle_view, container, false)
        val recyclerview = rootView.findViewById<RecyclerView>(R.id.news_list)
        recyclerview?.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val data = ArrayList<NewsListModel>()
        for (i in 1..20) {
            data.add(
                NewsListModel(
                    "Avisnavn",
                    "Tittel",
                    "Beskrivelse",
                    "",
                    "",
                    "Avis navn",
                    "",
                    R.drawable.ic_baseline_broken_image_24
                )
            )
        }
        val adapter = NewsAdapter(data)
        recyclerview?.adapter = adapter
        return rootView
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_recycle_view, container, false)
    }

}