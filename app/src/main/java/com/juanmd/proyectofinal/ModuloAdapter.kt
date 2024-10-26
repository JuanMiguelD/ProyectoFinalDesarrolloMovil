package com.juanmd.proyectofinal

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ModuloAdapter(
    private val modulos: List<Modulo>,
    private val moduloActual: Int,  // Progreso del usuario
    private val onItemClick: (Modulo) -> Unit
) : RecyclerView.Adapter<ModuloAdapter.ModuloViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModuloViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
        return ModuloViewHolder(view)
    }

    override fun onBindViewHolder(holder: ModuloViewHolder, position: Int) {
        val modulo = modulos[position]
        holder.textView.text = "Módulo ${position + 1}: ${modulo.nombre}"

        // Desactivar módulos superiores al progreso del usuario
        if (position + 1 > moduloActual) {
            holder.itemView.isEnabled = false
            holder.textView.setTextColor(Color.GRAY)  // Cambiar el color del texto a gris
        } else {
            holder.itemView.isEnabled = true
            holder.textView.setTextColor(Color.BLACK)  // Color normal para módulos accesibles
            holder.itemView.setOnClickListener { onItemClick(modulo) }
        }
    }

    override fun getItemCount(): Int {
        return modulos.size
    }

    class ModuloViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(android.R.id.text1)
    }
}
