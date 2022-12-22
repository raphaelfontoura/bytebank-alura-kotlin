package br.com.rddev.bytebank.model

class Cliente(
    val nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    private val senha: String
) : Autenticavel {
    override fun autenticar(senha: String): Boolean {
        return this.senha == senha
    }
}