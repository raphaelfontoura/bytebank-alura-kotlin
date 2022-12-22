package br.com.rddev.bytebank.model

import br.com.rddev.bytebank.model.Funcionario

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registrar(funcionario: Funcionario) {
        println("nome ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }


}