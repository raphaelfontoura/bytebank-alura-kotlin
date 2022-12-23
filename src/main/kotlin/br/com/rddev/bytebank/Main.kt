package br.com.rddev.bytebank

import br.com.rddev.bytebank.model.Endereco

fun main(args: Array<String>) {

    imprime(Any())
    imprime(1)
    imprime(1.0)
    imprime(Endereco())

}

fun imprime(valor: Any) {
    println(valor)
}

