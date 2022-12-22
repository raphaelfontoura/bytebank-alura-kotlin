package br.com.rddev.bytebank.model

interface Autenticavel {

    // ao utilizar este tipo de recurso em uma interface a property será pública.
    // portanto cuidado, caso a informação seja sensível como neste caso.

    // val senha: String

    fun autenticar(senha: String) : Boolean
//    {
//        return this.senha == senha
//    }
}