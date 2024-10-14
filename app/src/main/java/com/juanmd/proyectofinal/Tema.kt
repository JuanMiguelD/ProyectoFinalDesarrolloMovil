package com.juanmd.proyectofinal

import android.os.Parcel
import android.os.Parcelable

data class Tema(
    val nombre: String,
    val videoUrl: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString() ?: ""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeString(videoUrl)
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
    }
}
