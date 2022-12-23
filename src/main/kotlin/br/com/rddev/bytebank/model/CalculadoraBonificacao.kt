package br.com.rddev.bytebank.model

import br.com.rddev.bytebank.model.Funcionario

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registrar(funcionario: Any) {
//        funcionario as Funcionario
        if (funcionario is Funcionario) { // smart casting
            this.total += funcionario.bonificacao
        }
    }


}