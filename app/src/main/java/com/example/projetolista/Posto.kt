package com.example.projetolista

import java.io.Serializable

data class Posto(
    var nome: String,
    var gasolina: Double,
    var alcool: Double
) : Serializable{
    override fun toString(): String{
        return nome + " - [Álcool: $alcool : Gasolina: $gasolina]"
    }
}
