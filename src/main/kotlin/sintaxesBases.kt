fun sintaxesBases() {

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
}