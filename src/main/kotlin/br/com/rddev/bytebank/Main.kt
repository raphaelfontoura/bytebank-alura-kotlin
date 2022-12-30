package br.com.rddev.bytebank

import br.com.rddev.bytebank.example.html.testaTypeSafeHtml
import br.com.rddev.bytebank.model.*

fun main(args: Array<String>) {

    testaRun()

    testaHOFcomReceiver()

    testaTypeSafeHtml()

}

fun testaHOFcomReceiver() {
    somaReceiver(1, 5, resultado = {
        println(this)
    })

    val autenticavel = object : Autenticavel {
        val senha = "1234"
        override fun autenticar(senha: String): Boolean = this.senha == senha
    }

    val sistema = SistemaInterno()
    sistema.entraReceiver(autenticavel, "1234", autenticado = {
        pagamento()
    })
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    val total = a + b
    total.resultado()
}

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("taxa mensal $taxaMensal")

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Alex", cpf = "111.111.111-11", senha = "1234"), 1000)


    contaPoupanca
        .run {
            depositar(1000.0)
            saldo * taxaMensal
        }.let { rendimentoMensal ->
            println(rendimentoMensal)
        }

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }

    println(rendimentoAnual)
}

fun testaWith() {
    with(Endereco()) {
        logradouro = "rua vergueiro"
        numero = 3185
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "02310-063"
        complemento = "Apartamento"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}



