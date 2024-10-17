package com.juanmd.proyectofinal

import android.os.Parcelable
import android.os.Parcel
import android.util.Log


abstract class Ejercicio(
    open val pregunta: String
) : Parcelable {
    abstract fun verificarRespuesta(respuesta: String): Boolean

    // Método para escribir el tipo de ejercicio
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(javaClass.simpleName) // Escribir el nombre de la clase como tipo
        parcel.writeString(pregunta) // Escribir la pregunta
    }

    // Constructor que lee del Parcel
    protected constructor(parcel: Parcel) : this(
        parcel.readString() ?: ""
    )

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        // El CREATOR debe ser implementado en las clases concretas
        val CREATOR: Parcelable.Creator<Ejercicio> = object : Parcelable.Creator<Ejercicio> {
            override fun createFromParcel(parcel: Parcel): Ejercicio {
                val tipoEjercicio = parcel.readString() ?: throw IllegalArgumentException("Tipo de ejercicio nulo")
                Log.d("EjercicioCreator", "Tipo de ejercicio: $tipoEjercicio")

                return when (tipoEjercicio) {
                    "OpcionMultiple" -> OpcionMultiple(parcel)
                    "CompletarFrase" -> CompletarFrase(parcel)
                    "OrdenarPalabras" -> OrdenarPalabras(parcel)

                    else -> throw IllegalArgumentException("Tipo de ejercicio desconocido: $tipoEjercicio ")
                }
            }

            override fun newArray(size: Int): Array<Ejercicio?> {
                return arrayOfNulls(size)
            }
        }
    }
}

