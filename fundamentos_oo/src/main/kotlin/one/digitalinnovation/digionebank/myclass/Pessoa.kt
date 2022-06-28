package one.digitalinnovation.digionebank.myclass

class Pessoa {
    var nome: String = "Talita"

    var cpf: String = "123.456.789-00"
    private set
}

fun main() {
    val talita = Pessoa()

    println(talita.nome)
    println(talita.cpf)
}