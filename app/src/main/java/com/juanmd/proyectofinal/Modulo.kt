package com.juanmd.proyectofinal

import android.os.Parcel
import android.os.Parcelable

data class Modulo(
    val nombre: String,
    val temas: List<Tema>
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.createTypedArrayList(Tema.CREATOR) ?: emptyList()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeTypedList(temas)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Modulo> {
        override fun createFromParcel(parcel: Parcel): Modulo {
            return Modulo(parcel)
        }

        override fun newArray(size: Int): Array<Modulo?> {
            return arrayOfNulls(size)
        }
    }
}
