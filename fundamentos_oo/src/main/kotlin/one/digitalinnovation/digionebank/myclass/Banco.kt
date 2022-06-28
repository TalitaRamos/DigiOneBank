package one.digitalinnovation.digionebank.myclass

data class Banco(
    val nome: String,
    val numero: Int
) {
    fun info() = "$nome - $numero"
}