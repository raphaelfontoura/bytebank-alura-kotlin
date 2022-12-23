package br.com.rddev.bytebank

import br.com.rddev.bytebank.model.Endereco

fun main(args: Array<String>) {

    val endereco = Endereco()
    val enderecoNovo = Endereco()

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    endereco.logradouro = "Rua Fernando de Noronha"
    endereco.numero = 1005
    endereco.bairro = "Nowhere"
    endereco.cidade =  "Noone"
    endereco.estado = "OO"
    endereco.cep = "00000-000"

    enderecoNovo.cep = "00000-000"

    println(endereco.toString())
    println(enderecoNovo.toString())

    println(endereco.equals(enderecoNovo))

    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")
    println("${enderecoNovo.javaClass}@${Integer.toHexString(enderecoNovo.hashCode())}")

}


