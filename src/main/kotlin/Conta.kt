class Conta(
    var titular: String,
    val numero: Int,
    val ativa: Boolean = true
) {
    var saldo = 0.0
        private set
//        set(valor) {
//            if (valor > 0) field = valor
//        }
//        get(){return field}

//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }

    fun depositar(valor: Double) {
        if (valor > 0) this.saldo += valor
    }

    fun sacar(valor: Double) {
        if (saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transferir(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            this.saldo -= valor
            destino.depositar(valor)
            return true
        }
        return false
    }

//    fun getSaldo() : Double {
//        return saldo
//    }
//    fun setSaldo(valor: Double) {
//        this.saldo += valor
//    }
}