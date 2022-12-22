class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: String,
    val plr: Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {
    override val bonificacao: Double
        get() {
            return salario + plr
        }

}