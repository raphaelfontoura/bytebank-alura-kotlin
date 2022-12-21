fun main(args: Array<String>) {
    println("Bem vindo ao Bytebank!")

    testaContas()

}

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

fun testaContas() {
    val contaAlex = Conta("Alex", 1000)
    contaAlex.depositar(200.0)
    contaAlex.titular = "Alex Silva"

    val contaFran = Conta("Fran", 1001)
    contaFran.depositar(300.0)

    val contaJoao = Conta(titular = "João", numero = 1002, ativa = false)
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

    if (contaFran.transferir(30.0, contaAlex)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }
    println("conta ${contaAlex.titular} com saldo ${contaAlex.saldo}")
    println("conta ${contaFran.titular} com saldo ${contaFran.saldo}")

}

fun sintaxeBase() {
    val titular = "Alex"
    val conta = 1000
    var saldo = 0.0

    println("titular $titular")
    println("conta $conta")
    println("saldo $saldo")
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}

fun loopForSintaxe() {
    for (i in 1..3) {
        println(i)
    }

    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    for (i in 1..5) {
        if (i == 4) continue
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        val saldo: Double = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }
}

fun loopForBreakExample() {
    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }
}

fun loopWhileSintaxe() {
    var i = 0
    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        val saldo: Double = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }

    do {
        val y = i
    } while (y != null)
}