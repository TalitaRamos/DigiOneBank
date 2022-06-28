package one.digitalinnovation.digionebank.myclass.teste

import one.digitalinnovation.digionebank.myclass.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "DigiOne2")

    println(banco2.info())
 }