package one.digitalinnovation.digionebank.myclass.teste

import one.digitalinnovation.digionebank.myclass.Analista
import one.digitalinnovation.digionebank.testes.ImprimeRelatorioFuncionario

fun main() {
    val func = Analista("Talita", "123.456.789-00", 5000.0)

    ImprimeRelatorioFuncionario.imprime(func)

}
