interface Autenticavel {

    val senha: String
    fun autenticar(senha: String) : Boolean {
        return this.senha == senha
    }
}