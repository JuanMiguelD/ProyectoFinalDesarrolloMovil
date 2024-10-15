package com.juanmd.proyectofinal

import android.os.Parcel
import android.os.Parcelable

class OpcionMultiple(
    override var pregunta: String,
    val opciones: List<String>,
    val respuestaCorrecta: String
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
        parcel.writeString(pregunta)
        parcel.writeStringList(opciones)
        parcel.writeString(respuestaCorrecta)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<OpcionMultiple> {
        override fun createFromParcel(parcel: Parcel): OpcionMultiple {
            return OpcionMultiple(parcel)
        }

        override fun newArray(size: Int): Array<OpcionMultiple?> {
            return arrayOfNulls(size)
        }
    }
}
