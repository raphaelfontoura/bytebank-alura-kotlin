fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-22",
        salario = 1000.0,
        senha = "1234"
    )

    val diretora = Diretor(
        nome = "Fran",
        cpf = "222.222.222-33",
        salario = 2000.0,
        senha = "4321",
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "333.333.333-44",
        "pass"
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, "1234")
    sistema.entra(diretora, "4321")
    sistema.entra(cliente, "pass")

}