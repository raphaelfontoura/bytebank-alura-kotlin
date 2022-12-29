package br.com.rddev.bytebank

fun main(args: Array<String>) {

    val minhaFuncao: () -> Unit = :: teste
    println(minhaFuncao())

    val minhaFuncaoClasse: () -> Unit = Teste() // o tipo pode ser omitido.
    val minhaFuncaoClasse2 = Teste()
    println(minhaFuncaoClasse())
}

fun teste() {
    println("Executa teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("Executa invoke do Teste")
    }
}

