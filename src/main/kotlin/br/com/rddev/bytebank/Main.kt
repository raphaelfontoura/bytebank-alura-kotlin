package br.com.rddev.bytebank

fun main(args: Array<String>) {

    testaFuncaoLambdaEAnonima()

}

fun testaFuncaoLambdaEAnonima() {
    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b ->
        println("Executa como lambda")
        a + b
    }
    println(minhaFuncaoLambda(15, 10))

    val minhaFuncaoLambdaRef = { a: Int, b: Int ->
        a + b
    }
    println(minhaFuncaoLambdaRef(15, 11))

    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Executa como anônima")
    }
    println(minhaFuncaoAnonima())

    val minhaFuncaoAnonimaRef = fun(a: Int, b: Int) : Int {
        println("Executa como anônima")
        return a + b
    }
    println(minhaFuncaoAnonimaRef(15, 12))
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: () -> Unit = Teste() // o tipo pode ser omitido.
    val minhaFuncaoClasse2 = Teste()
    println(minhaFuncaoClasse())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun soma(a: Int, b: Int) : Int {
    return a + b
}

class Teste : () -> Unit {
    override fun invoke() {
        println("Executa invoke do Teste")
    }
}

