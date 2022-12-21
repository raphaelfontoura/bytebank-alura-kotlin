class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String,
    val plr: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double
        get() {
            return salario + plr
        }

    fun autenticar(senha: String): Boolean {
        if (this.senha == senha) return true
        return false
    }
}