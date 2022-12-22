package br.com.rddev.bytebank

import br.com.rddev.bytebank.model.Conta
import br.com.rddev.bytebank.teste.testaContas

fun main(args: Array<String>) {

    testaContas()

    println("Total de contas: ${Conta.Contador.total}")

}

