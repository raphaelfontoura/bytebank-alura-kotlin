package br.com.rddev.bytebank.teste

import br.com.rddev.bytebank.exception.FalhaAutenticacaoException
import br.com.rddev.bytebank.exception.SaldoInsuficienteException
import br.com.rddev.bytebank.model.Cliente
import br.com.rddev.bytebank.model.ContaCorrente
import br.com.rddev.bytebank.model.ContaPoupanca

fun testaContas() {
    val alex = Cliente(nome = "Alex",cpf = "111.111.111-11", senha = "1234")
    val contaAlex = ContaCorrente(alex, 1000)
    contaAlex.depositar(200.0)

    val fran = Cliente(nome = "Fran", cpf = "222.222.222-22", senha = "1234")
    val contaFran = ContaPoupanca(fran, 1001)
    contaFran.depositar(300.0)

    val joao = Cliente(nome = "João", cpf = "333.333.333-33", senha = "1234")
    val contaJoao = ContaCorrente(titular = joao, numero = 1002)
    println("conta ${contaJoao.titular} está ${if(contaJoao.ativa) "ativa" else "inativa"}")

    println(contaAlex.titular)
    println(contaFran.titular)

    contaAlex.depositar(50.0)
    contaFran.depositar(70.0)
    println("conta ${contaAlex.titular} com saldo ${contaAlex.saldo}")
    println("conta ${contaFran.titular} com saldo ${contaFran.saldo}")

    contaAlex.sacar(100.0)
    contaFran.sacar(300.0)
    println("conta ${contaAlex.titular} com saldo ${contaAlex.saldo}")
    println("conta ${contaFran.titular} com saldo ${contaFran.saldo}")

    contaAlex.sacar(100.0)
    contaFran.sacar(300.0)
    println("conta ${contaAlex.titular} com saldo ${contaAlex.saldo}")
    println("conta ${contaFran.titular} com saldo ${contaFran.saldo}")

    try {
        contaFran.transferir(30.0, contaAlex, "4321")
        println("Transferência sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("${e.message}")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na Transferência")
        println("${e.message}")
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }

    println("conta ${contaAlex.titular} com saldo ${contaAlex.saldo}")
    println("conta ${contaFran.titular} com saldo ${contaFran.saldo}")

}