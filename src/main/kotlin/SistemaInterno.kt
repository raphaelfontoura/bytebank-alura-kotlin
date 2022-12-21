class SistemaInterno {
    fun entra(admin: FuncionarioAdmin, senha: String) {
        if (admin.autenticar(senha)) {
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }

}