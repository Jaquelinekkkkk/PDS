package Interfaces;

public class Calculadora {
    private float precoPorQuilo;
    private float peso;

    public Calculadora(float precoPorQuilo, float peso) {
        this.precoPorQuilo = precoPorQuilo;
        this.peso = peso;
    }

    public float calcularValor() {
        return precoPorQuilo * peso;
    }
}
