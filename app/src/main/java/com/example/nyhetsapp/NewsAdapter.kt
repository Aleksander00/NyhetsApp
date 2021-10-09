package com.example.nyhetsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class NewsAdapter(private val mList: List<NewsListModel>) :
    RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.news_list_item, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val NewsListModel = mList[position]

        holder.source.text = NewsListModel.avis_navn
        holder.title.text = NewsListModel.tittel
        holder.desc.text = NewsListModel.beskrivelse
        holder.image.setImageResource(NewsListModel.bilde)

        // sets the image to the imageview from our itemHolder class
       // holder.imageView.setImageResource(ItemsViewModel.image)


    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val source: TextView = itemView.findViewById(R.id.source)
        val title: TextView = itemView.findViewById(R.id.title)
        val desc: TextView = itemView.findViewById(R.id.description)
        val image: ImageView = itemView.findViewById(R.id.thumbnail)
       // val imageView: ImageView = itemView.findViewById(R.id.imageview)
    }
}
