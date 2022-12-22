package br.com.rddev.bytebank.model

class SistemaInterno {
    fun entra(admin: Autenticavel, senha: String) {
        if (admin.autenticar(senha)) {
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }

}