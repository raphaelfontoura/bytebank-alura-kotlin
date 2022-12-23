package br.com.rddev.bytebank.teste

import br.com.rddev.bytebank.model.Autenticavel

fun testaObjects() {

    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: String = "pass"

        override fun autenticar(senha: String): Boolean {
            return this.senha == senha
        }
    }

    if (fran.autenticar("pass")) {
        println("Autenticado de um objeto anônimo. Bem vindo.")
    } else {
        println("Falha na autenticação do objeto anônimo.")
    }

}