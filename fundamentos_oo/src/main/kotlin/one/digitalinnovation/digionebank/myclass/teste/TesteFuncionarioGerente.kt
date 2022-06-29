package one.digitalinnovation.digionebank.myclass.teste

import one.digitalinnovation.digionebank.myclass.Gerente

fun main() {
    val func = Gerente("Talita", "123.456.789-00", 5000.0)

    ImprimeRelatorioFuncionario.imprime(func)

}

