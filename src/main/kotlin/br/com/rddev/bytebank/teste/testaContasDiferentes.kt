package br.com.rddev.bytebank.teste

import br.com.rddev.bytebank.model.Cliente
import br.com.rddev.bytebank.model.ContaCorrente
import br.com.rddev.bytebank.model.ContaPoupanca

public fun testaContasDiferentes() {
    val alex = Cliente("Alex", "111.111.111-11", "1234")
    val contaCorrente = ContaCorrente(
        titular = alex,
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente("Fran", "222.222.222-22", "1234"),
        numero = 1001
    )

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)
    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)
    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transferir(100.0, contaPoupanca)
    println("saldo após transferência corrente: ${contaCorrente.saldo}")
    println("saldo após transferência poupança: ${contaPoupanca.saldo}")
}