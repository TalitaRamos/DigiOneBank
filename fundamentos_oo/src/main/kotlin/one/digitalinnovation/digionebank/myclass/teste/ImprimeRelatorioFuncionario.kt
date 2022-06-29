package one.digitalinnovation.digionebank.myclass.teste

import one.digitalinnovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}