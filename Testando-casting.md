### Testando Casting

O código para testar o comportamento de polimorfismo na calculadora fica da seguinte maneira:

```kotlin
class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Any) {
        funcionario as Funcionario
        this.total += funcionario.bonificacao
    }

}
```

Também existe a alternativa com o smart cast:

```kotlin
fun registra(funcionario: Any) {
    if(funcionario is Funcionario){
        this.total += funcionario.bonificacao   
    }
}
```

A diferença é que, com o Smart cast, evitamos o problema de lançarmos Exception, que apresenta um problema no programa.