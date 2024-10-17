package com.juanmd.proyectofinal

import android.os.Parcel
import android.os.Parcelable


class OrdenarPalabras(
    override var pregunta: String,
    val palabrasDesordenadas: List<String>, // Lista de palabras desordenadas
    val respuestaCorrecta: String // La frase correctamente ordenada
) : Ejercicio(pregunta), Parcelable {

    override fun verificarRespuesta(respuesta: String): Boolean {
        return respuesta.equals(respuestaCorrecta, ignoreCase = true)
    }

    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.createStringArrayList() ?: emptyList(),
        parcel.readString() ?: ""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString("OrdenarPalabras")
        parcel.writeString(pregunta)
        parcel.writeStringList(palabrasDesordenadas)
        parcel.writeString(respuestaCorrecta)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<OrdenarPalabras> {
        override fun createFromParcel(parcel: Parcel): OrdenarPalabras {
            return OrdenarPalabras(parcel)
        }

        override fun newArray(size: Int): Array<OrdenarPalabras?> {
            return arrayOfNulls(size)
        }
    }
}
