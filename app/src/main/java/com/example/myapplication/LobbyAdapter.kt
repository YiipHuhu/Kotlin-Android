package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LobbyAdapter(
    private val options: List<String>,
    private val onClick: (String) -> Unit
) : RecyclerView.Adapter<LobbyAdapter.LobbyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LobbyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_option, parent, false)
        return LobbyViewHolder(view)
    }

    override fun onBindViewHolder(holder: LobbyViewHolder, position: Int) {
        val option = options[position]
        holder.bind(option, onClick)
    }

    override fun getItemCount(): Int = options.size

    class LobbyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val activityButton: Button = itemView.findViewById(R.id.activityButton)

        fun bind(option: String, onClick: (String) -> Unit) {
            activityButton.text = option
            activityButton.setOnClickListener {
                onClick(option)
            }
        }
    }
}
