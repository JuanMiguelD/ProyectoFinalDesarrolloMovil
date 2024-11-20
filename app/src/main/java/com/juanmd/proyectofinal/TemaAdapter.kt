package com.juanmd.proyectofinal

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TemaAdapter(
    private val temas: List<Tema>,
    private val onItemClick: (Tema) -> Unit
) : RecyclerView.Adapter<TemaAdapter.TemaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TemaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
        return TemaViewHolder(view)
    }

    override fun onBindViewHolder(holder: TemaViewHolder, position: Int) {
        val tema = temas[position]
        holder.textView.text = tema.nombre
        holder.textView.setTextColor(Color.WHITE)
        holder.itemView.setOnClickListener { onItemClick(tema)
        }
    }

    override fun getItemCount(): Int {
        return temas.size
    }

    class TemaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(android.R.id.text1)
    }
}
