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
    println("bonificacao ${alex.bonificacao}")
    println()

    val fran = Gerente(
        nome = "Fran",
        cpf = "111.222.333-67",
        salario = 2000.0,
        senha = "1234#"
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificacao ${fran.bonificacao}")
    println("autenticacao ${fran.autenticar("1234#")}")
    println()

    val gui = Diretor(
        nome = "Guilherme",
        cpf = "111.222.333-89",
        salario = 4000.0,
        senha = "#1234",
        plr = 200.0
    )

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificacao ${gui.bonificacao}")
    println("autenticacao ${gui.autenticar("1234#")}")
    println("plr ${gui.plr}")
    println()

    val calculadora = CalculadoraBonificacao()
    calculadora.registrar(alex)
    calculadora.registrar(fran)
    calculadora.registrar(gui)

    println("Total bonificação ${calculadora.total}")

}

