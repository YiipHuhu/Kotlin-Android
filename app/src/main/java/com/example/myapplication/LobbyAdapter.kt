package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LobbyAdapter(private val options: List<String>, private val clickListener: (String) -> Unit) :
    RecyclerView.Adapter<LobbyAdapter.LobbyViewHolder>() {

    class LobbyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val optionTextView: TextView = itemView.findViewById(R.id.optionTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LobbyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_option, parent, false)
        return LobbyViewHolder(view)
    }

    override fun onBindViewHolder(holder: LobbyViewHolder, position: Int) {
        val option = options[position]
        holder.optionTextView.text = option
        holder.itemView.setOnClickListener { clickListener(option) }
    }

    override fun getItemCount() = options.size
}
