package br.com.rddev.bytebank.model

import br.com.rddev.bytebank.exception.FalhaAutenticacaoException
import br.com.rddev.bytebank.exception.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numero: Int,
    var ativa: Boolean = true
) : Autenticavel {
    var saldo = 0.0
        protected set
    companion object Contador {
        var total: Int = 0
            private set
    }
    init {
        println("Criando conta")
        total++
    }

    override fun autenticar(senha: String): Boolean {
        return titular.autenticar(senha)
    }

    fun depositar(valor: Double) {
        if (valor > 0) this.saldo += valor
    }

    abstract fun sacar(valor: Double)

    fun transferir(valor: Double, destino: Conta, senha: String) {
        if (saldo < valor) {
            throw SaldoInsuficienteException("O saldo é insuficiente. Saldo: ${saldo}")
        }
        if (!autenticar(senha)) {
            throw FalhaAutenticacaoException()
        }
        this.saldo -= valor
        destino.depositar(valor)
    }

}