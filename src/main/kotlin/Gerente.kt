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
            println("bonificação Gerente")
            return super.bonificacao + salario
        }

    fun autenticar(senha: String): Boolean {
        if (this.senha == senha) return true
        return false
    }
}