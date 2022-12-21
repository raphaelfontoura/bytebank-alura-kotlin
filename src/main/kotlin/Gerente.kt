class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            return salario * 0.2
        }

    fun autenticar(senha: String): Boolean {
        if (this.senha == senha) return true
        return false
    }
}