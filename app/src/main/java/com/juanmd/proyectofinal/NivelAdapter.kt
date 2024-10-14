package com.juanmd.proyectofinal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NivelAdapter(
    private val niveles: List<Nivel>,
    private val onItemClick: (Nivel) -> Unit
) : RecyclerView.Adapter<NivelAdapter.NivelViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NivelViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
        return NivelViewHolder(view)
    }

    override fun onBindViewHolder(holder: NivelViewHolder, position: Int) {
        val nivel = niveles[position]
        holder.textView.text = nivel.nombre
        holder.itemView.setOnClickListener { onItemClick(nivel) }
    }

    override fun getItemCount(): Int {
        return niveles.size
    }

    class NivelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(android.R.id.text1)
    }
}