package br.com.rddev.bytebank.teste

fun testaString() {

    val x = 10
    var y = x
    y++

    println(x)
    println(y)

    val palavra = "palavra"
    var palavraNova = palavra
    palavraNova = "palavraNova"

    println(palavra)
    println(palavraNova)
    // String é um objeto, não é um tipo primitivo.
    // porém String é imutável. Logo ao atribuir um novo valor,
    // na verdade é criado um novo espaço na memória e atribuído uma nova string.

    for (c in palavra) {
        println(c == 'a')
    }

    val substring = palavra.substring(4)

}