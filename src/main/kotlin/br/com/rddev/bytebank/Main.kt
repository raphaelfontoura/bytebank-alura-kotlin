package br.com.rddev.bytebank

fun main(args: Array<String>) {

    val minhaFuncaoLambda: () -> Unit = {
        println("Executa como lambda")
    }
    println(minhaFuncaoLambda())

    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Executa como anônima")
    }
    println(minhaFuncaoAnonima())

}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: () -> Unit = Teste() // o tipo pode ser omitido.
    val minhaFuncaoClasse2 = Teste()
    println(minhaFuncaoClasse())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())
}

fun teste() {
    println("Executa teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("Executa invoke do Teste")
    }
}

