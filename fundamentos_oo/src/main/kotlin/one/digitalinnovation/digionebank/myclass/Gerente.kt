package one.digitalinnovation.digionebank.myclass

class Gerente(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario){

    override fun calculoAuxilio() = salario * 0.4
}