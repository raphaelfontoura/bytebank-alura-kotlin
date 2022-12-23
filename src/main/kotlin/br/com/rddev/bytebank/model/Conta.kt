package br.com.rddev.bytebank.model

import br.com.rddev.bytebank.exception.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numero: Int,
    var ativa: Boolean = true
) {
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

    fun depositar(valor: Double) {
        if (valor > 0) this.saldo += valor
    }

    abstract fun sacar(valor: Double)

    fun transferir(valor: Double, destino: Conta) {
        if (saldo < valor) throw SaldoInsuficienteException()
        this.saldo -= valor
        destino.depositar(valor)
    }

}