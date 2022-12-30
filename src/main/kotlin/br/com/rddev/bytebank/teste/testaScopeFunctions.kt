package br.com.rddev.bytebank.teste

import br.com.rddev.bytebank.model.Autenticavel
import br.com.rddev.bytebank.model.Endereco
import br.com.rddev.bytebank.model.SistemaInterno
import kotlin.random.Random

fun testaScopeFunction() {
    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase() //deprecated
    val enderecoMaiusculo = "${endereco.logradouro}, ${endereco.numero}".uppercase()

    val enderecoMaiusculoLet = Endereco(logradouro = "rua vergueiro", numero = 3185)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".uppercase()
        }
        .let(::println)
//        .let { enderecoMaiusculo ->
//            println(enderecoMaiusculo)
//        }

    listOf(
        Endereco(complemento = "casa", numero = 10),
        Endereco(numero = 20),
        Endereco(complemento = "apartamento", numero = 30)
    )
        .filter { endereco -> endereco.complemento?.isNotEmpty() ?: false }
        .let(::println)

    soma(1, 5) {
        println(it)
    }

    val autenticavel = object : Autenticavel {
        val senha = "1234"
        override fun autenticar(senha: String) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, "1234") {
        println("realizar pagamento")
    }
    SistemaInterno().entra(autenticavel, "1234", autenticado = {
        println("realizar pagamento")
    })

    getRandomInt()

    Endereco(logradouro = "rua vergueiro", numero = 3187, estado = "SP")
        .also { println("Adicionando o Estado") }
        .apply { cidade = "São Paulo" }
        .also { println("Imprimindo o endereço em letras maiúsculas") }
        .run { "$logradouro, $numero - $cidade - $estado".uppercase() }
        .let(::println)
}

fun getRandomInt(): Int {
    return Random.nextInt(60).also {
        println("getRandomInt() generated value $it")
    }
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("antes da soma")
    resultado(a + b)
    println("depois da soma")
}