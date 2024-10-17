package com.juanmd.proyectofinal

import android.os.Parcel
import android.os.Parcelable

data class Modulo(
    val nombre: String,
    val temas: List<Tema>
)
