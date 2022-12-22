abstract class Conta(
    var titular: String,
    val numero: Int,
    val ativa: Boolean = true
) {
    var saldo = 0.0
        protected set

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