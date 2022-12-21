fun testaContas() {
    val contaAlex = ContaCorrente("Alex", 1000)
    contaAlex.depositar(200.0)
    contaAlex.titular = "Alex Silva"

    val contaFran = ContaPoupanca("Fran", 1001)
    contaFran.depositar(300.0)

    val contaJoao = ContaCorrente(titular = "João", numero = 1002)
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