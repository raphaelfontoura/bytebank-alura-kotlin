package br.com.rddev.bytebank

import br.com.rddev.bytebank.model.Endereco
import br.com.rddev.bytebank.teste.testaFuncaoLambdaEAnonima

fun main(args: Array<String>) {

    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase() //deprecated
    val enderecoMaiusculo = "${endereco.logradouro}, ${endereco.numero}".uppercase()

    val enderecoMaiusculoLet = Endereco(logradouro = "rua vergueiro", numero = 3185)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".uppercase()
        }
        .let(::println)
//        .let { enderecoMaiusculo ->
//            println(enderecoMaiusculo)
//        }

    listOf(
        Endereco(complemento = "casa", numero = 10),
        Endereco(numero = 20),
        Endereco(complemento = "apartamento", numero = 30)
    )
        .filter { endereco -> endereco.complemento?.isNotEmpty() ?: false }
        .let(::println)

}



