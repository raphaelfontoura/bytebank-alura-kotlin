package br.com.rddev.bytebank.teste

import br.com.rddev.bytebank.model.Endereco

fun testeRecursosNullSafety() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Maranhão")
    println(enderecoNulo?.logradouro) // safe call
    println(enderecoNulo?.bairro)
    println(enderecoNulo?.logradouro?.length)

//    enderecoNulo = null
    enderecoNulo?.let {
        println(it.logradouro)
        println("${it.logradouro.length}")
        println(it.bairro)
        val tamanhoComplemento: Int = it.complemento?.length ?: 0 // Elvis operator
//        val tamanhoComException: Int = it.complemento?.length ?: throw IllegalArgumentException()
        println("Tamanho do complemento: $tamanhoComplemento")
    }

    enderecoNulo?.let { endereco: Endereco ->
        println(endereco.logradouro)
        println("${endereco.logradouro.length}")
    }

    teste(1)
    teste("")
}

fun teste(valor: Any) {
    val numero: Int? = valor as? Int
    println(numero)
}