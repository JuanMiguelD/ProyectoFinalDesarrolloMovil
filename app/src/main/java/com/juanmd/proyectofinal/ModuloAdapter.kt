package com.juanmd.proyectofinal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ModuloAdapter(
    private val modulos: List<Modulo>,
    private val onItemClick: (Modulo) -> Unit
) : RecyclerView.Adapter<ModuloAdapter.ModuloViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModuloViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
        return ModuloViewHolder(view)
    }

    override fun onBindViewHolder(holder: ModuloViewHolder, position: Int) {

        val modulo = modulos[position]
        holder.textView.text = modulo.nombre
        holder.itemView.setOnClickListener { onItemClick(modulo) }


    }

    override fun getItemCount(): Int {
        return modulos.size
    }

    class ModuloViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(android.R.id.text1)
    }
}