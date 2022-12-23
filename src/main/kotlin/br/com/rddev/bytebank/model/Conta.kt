package br.com.rddev.bytebank.model

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

    fun transferir(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            this.saldo -= valor
            destino.depositar(valor)
            return true
        }
        return false
    }

}