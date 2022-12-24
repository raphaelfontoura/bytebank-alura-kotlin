package br.com.rddev.bytebank.exception

class SaldoInsuficienteException(
    mensagem: String = "O saldo é insuficiente"
) : Exception(mensagem) {
}