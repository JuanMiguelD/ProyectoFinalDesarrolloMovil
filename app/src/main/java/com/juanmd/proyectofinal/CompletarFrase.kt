package com.juanmd.proyectofinal

import android.os.Parcel
import android.os.Parcelable

class CompletarFrase(
    override var pregunta: String,
    val fraseIncompleta: String, // Frase con espacios para completar
    val respuestaCorrecta: String // La respuesta correcta
) : Ejercicio(pregunta), Parcelable {

    override fun verificarRespuesta(respuesta: String): Boolean {
        return respuesta.equals(respuestaCorrecta, ignoreCase = true)
    }

    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: ""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        super.writeToParcel(parcel, flags) // Asegúrate de llamar al método de la clase base
        parcel.writeString(fraseIncompleta) // Escribir la frase incompleta
        parcel.writeString(respuestaCorrecta) // Escribir la respuesta correcta
    }

    companion object CREATOR : Parcelable.Creator<CompletarFrase> {
        override fun createFromParcel(parcel: Parcel): CompletarFrase {
            return CompletarFrase(parcel)
        }

        override fun newArray(size: Int): Array<CompletarFrase?> {
            return arrayOfNulls(size)
        }
    }
}
