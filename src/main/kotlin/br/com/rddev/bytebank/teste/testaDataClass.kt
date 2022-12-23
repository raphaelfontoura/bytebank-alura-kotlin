package br.com.rddev.bytebank.teste

fun testaDataClass() {
    val alex = Pessoa(
        nome = "Alex",
        idade = 25
    )
    alex.fala()

    val documento = Documento(
        rg = "123456-7",
        cpf = "111.222.333-45"
    )

    println(alex)
    println(documento)

    val outroAlex = Pessoa(
        nome = "Alex",
        idade = 25
    )
    println(alex == outroAlex)

    val documentoCopia = Documento(
        rg = "123456-7",
        cpf = "111.222.333-45"
    )

    println(documento == documentoCopia)
    // destructuring
    val (rg, cpf) = documentoCopia
    println("RG:$rg e CPF:$cpf obtidos por Destructuring Declarations")

    val (nome) = alex
    println("Obtendo nome $nome por destruct.")

    val documento3 = documento.copy()
    val documento4 = documento.copy(rg = "456789-0")

    println(documento)
    println(documento3)
    println(documento4)

}

class Pessoa(
    val nome: String,
    val idade: Int,
) {
    fun fala() {
        println("$nome falando")
    }

    operator fun component1() = this.nome
}

data class Documento(
    val rg: String,
    val cpf: String
)