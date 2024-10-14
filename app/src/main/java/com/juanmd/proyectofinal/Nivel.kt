package com.juanmd.proyectofinal
import android.os.Parcel
import android.os.Parcelable

data class Nivel(
    val nombre: String,
    val modulos: List<Modulo>
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.createTypedArrayList(Modulo.CREATOR) ?: emptyList()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeTypedList(modulos)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Nivel> {
        override fun createFromParcel(parcel: Parcel): Nivel {
            return Nivel(parcel)
        }

        override fun newArray(size: Int): Array<Nivel?> {
            return arrayOfNulls(size)
        }
    }
}
