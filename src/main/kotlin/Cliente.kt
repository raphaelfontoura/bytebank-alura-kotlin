class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: String
) : Autenticavel {
    override fun autenticar(senha: String): Boolean {
        return this.senha == senha
    }
}