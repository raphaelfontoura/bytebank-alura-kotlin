package br.com.rddev.bytebank.model

class SistemaInterno {
    fun entra(admin: Autenticavel, senha: String) {
        if (admin.autenticar(senha)) {
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }

        when (admin) {
            is FuncionarioAdmin -> {
                println("Opções admin")
            }
            is Funcionario -> {
                println("Opções comum")
            }
            else -> {
                println("Opções reduzidas")
            }
        }
    }

}