package br.com.rddev.bytebank.teste

import br.com.rddev.bytebank.model.Cliente
import br.com.rddev.bytebank.model.ContaCorrente
import br.com.rddev.bytebank.model.ContaPoupanca
import br.com.rddev.bytebank.model.Endereco

public fun testaContasDiferentes() {
    val alex = Cliente(
        nome = "Alex",
        cpf = "111.111.111-11",
        senha = "1234",
        endereco = Endereco(
            logradouro = "qd 06 cj 3",
            numero = 18,
            bairro = "Sobradinho",
            cidade = "Brasília",
            estado = "DF"
        )
    )
    val contaCorrente = ContaCorrente(
        titular = alex,
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "Fran", cpf = "222.222.222-22", senha = "1234"),
        numero = 1001
    )

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)
    println("Titular")
    println("nome do titular ${contaCorrente.titular.nome} e cpf ${contaCorrente.titular.cpf}")
    println("saldo corrente: ${contaCorrente.saldo}")
    println("Titular")
    println("nome do titular ${contaPoupanca.titular.nome} e cpf ${contaPoupanca.titular.cpf}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)
    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transferir(100.0, contaPoupanca, "1234")
    println("saldo após transferência corrente: ${contaCorrente.saldo}")
    println("saldo após transferência poupança: ${contaPoupanca.saldo}")
}