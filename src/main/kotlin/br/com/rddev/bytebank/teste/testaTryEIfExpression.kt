package br.com.rddev.bytebank.teste

fun testaTryEIfExpression() {
    val entrada: String = "1.2"

    val valorRecebido: Double? = try { // try expression
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        e.printStackTrace()
        null
    }

    println("$valorRecebido")

    val valorComTaxa: Double? = if (valorRecebido != null) { //if expression
        valorRecebido + 0.1
    } else {
        null
    }

    println("$valorComTaxa")
}