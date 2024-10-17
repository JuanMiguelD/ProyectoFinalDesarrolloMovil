package com.juanmd.proyectofinal

import android.os.Parcel
import android.os.Parcelable

data class Tema(
    val nombre: String,
    val videoUrl: String,
    val ejercicios: List<Ejercicio> // Lista de ejercicios de tipo Ejercicio (Parcelable)
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.createTypedArrayList(CREATOR_EJERCICIOS) ?: emptyList()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeString(videoUrl)
        parcel.writeTypedList(ejercicios)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Tema> {
        override fun createFromParcel(parcel: Parcel): Tema {
            return Tema(parcel)
        }

        override fun newArray(size: Int): Array<Tema?> {
            return arrayOfNulls(size)
        }

        // Creador genérico para los ejercicios
        val CREATOR_EJERCICIOS: Parcelable.Creator<Ejercicio> = object : Parcelable.Creator<Ejercicio> {
            override fun createFromParcel(parcel: Parcel): Ejercicio {
                // Lee el tipo de ejercicio del parcel y crea la instancia correcta
                val type = parcel.readString() ?: throw IllegalArgumentException("No type provided")
                return when (type) {
                    "OpcionMultiple" -> OpcionMultiple(parcel)

                    "CompletarFrase" -> CompletarFrase(parcel)
                    "OrdenarPalabras" -> OrdenarPalabras(parcel)
                    else -> throw IllegalArgumentException("Unknown exercise type: $type")
                }
            }

            override fun newArray(size: Int): Array<Ejercicio?> {
                return arrayOfNulls(size)
            }
        }
    }
}

