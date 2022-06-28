package one.digitalinnovation.digionebank.myclass

class Pessoa {
    var nome: String = "Talita"

    var cpf: String = "123.456.789-00"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val talita = Pessoa()

    println(talita.pessoaInfo())
}