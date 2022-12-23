package br.com.rddev.bytebank.model

import br.com.rddev.bytebank.model.Funcionario

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registrar(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }

}