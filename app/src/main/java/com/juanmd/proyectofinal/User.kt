package com.juanmd.proyectofinal

class User {
    var name: String? = null
    var email: String? = null
    var uid: String? = null
    var nivelActual: String? = null
    var moduloActual: Int? = null
    var temaActual: Int? = null

    constructor() {}

    constructor(
        name: String?,
        email: String?,
        uid: String?,
        nivelActual: String?,
        moduloActual: Int?,
        temaActual: Int?
    ) {
        this.name = name
        this.email = email
        this.uid = uid
        this.nivelActual = nivelActual
    }
}