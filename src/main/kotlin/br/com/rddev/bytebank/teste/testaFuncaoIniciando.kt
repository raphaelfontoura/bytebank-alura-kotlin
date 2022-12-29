package br.com.rddev.bytebank.teste

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
