package com.juanmd.proyectofinal

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NivelAdapter(
    private val niveles: List<Nivel>,
    private val nivelActual: String?,  // Para comparar con el nivel del usuario
    private val moduloActual: Int,      // Módulo actual del usuario
    private val onItemClick: (Nivel) -> Unit
) : RecyclerView.Adapter<NivelAdapter.NivelViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NivelViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
        return NivelViewHolder(view)
    }

    override fun onBindViewHolder(holder: NivelViewHolder, position: Int) {
        val nivel = niveles[position]
        holder.textView.text = nivel.nombre

        // Verificar si el nivel está desbloqueado
        val desbloqueado = esNivelDesbloqueado(nivel)

        // Si el nivel está desbloqueado, permite el clic y cambia el color de fondo
        if (desbloqueado) {
            holder.itemView.setBackgroundColor(Color.WHITE)
            holder.itemView.isClickable = true
            holder.itemView.setOnClickListener { onItemClick(nivel) }
        } else {
            // Si está bloqueado, muestra el nivel en gris y deshabilita el clic
            holder.itemView.setBackgroundColor(Color.LTGRAY)
            holder.itemView.isClickable = false
        }
    }

    override fun getItemCount(): Int {
        return niveles.size
    }

    private fun esNivelDesbloqueado(nivel: Nivel): Boolean {
        // Lista ordenada de niveles
        val ordenNiveles = listOf("A1", "A2", "B1", "B2", "C1", "C2")
        val indiceNivelActual = ordenNiveles.indexOf(nivelActual)
        val indiceNivelSeleccionado = ordenNiveles.indexOf(nivel.nombre)

        // Solo se puede acceder a los niveles menores o iguales al nivel actual
        return indiceNivelSeleccionado <= indiceNivelActual &&
                (indiceNivelSeleccionado < indiceNivelActual || moduloActual >= 1) // Verifica que haya completado al menos el primer módulo del nivel
    }

    class NivelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(android.R.id.text1)
    }
}
