package one.digitalinnovation.digionebank.myclass.teste

import one.digitalinnovation.digionebank.myclass.ClientTipo

fun main() {
    ClientTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    println("-------------")

    ClientTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    println("-------------")

    val pf = ClientTipo.PF
    println("${pf.name} - ${pf.descricao}")

    println("-------------")

    val pj = ClientTipo.PJ
    println("${pj.name} - ${pj.descricao}")
}