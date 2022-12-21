abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    override val senha: String
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {

}