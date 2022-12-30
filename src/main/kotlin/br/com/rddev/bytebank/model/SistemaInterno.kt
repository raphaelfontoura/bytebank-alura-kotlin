package br.com.rddev.bytebank.model

class SistemaInterno {
    fun entra(admin: Autenticavel, senha: String, autenticado: () -> Unit = {}) {
        if (admin.autenticar(senha)) {
            println("Bem vindo ao Bytebank")
            autenticado()
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

    fun entraReceiver(admin: Autenticavel, senha: String, autenticado: SistemaInterno.() -> Unit = {}) {
        if (admin.autenticar(senha)) {
            println("Bem vindo ao Bytebank")
            autenticado()
        } else {
            println("Falha na autenticação")
        }
    }

    fun pagamento() {
        println("Realizando pagamento")
    }

}