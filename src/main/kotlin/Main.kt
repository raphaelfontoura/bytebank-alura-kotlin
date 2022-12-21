fun main(args: Array<String>) {
    println("Bem vindo ao Bytebank!")

    val alex = Funcionario(
        nome = "Alex",
        cpf = "111.222.333-45",
        salario = 1000.0
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificacao ${alex.bonificacao()}")

}

