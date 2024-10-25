package Interfaces;

public class CalculoLitros {
    private float precoPorLitro;
    private float valorPagamento;

    public CalculoLitros(float precoPorLitro, float valorPagamento) {
        this.precoPorLitro = precoPorLitro;
        this.valorPagamento = valorPagamento;
    }

    public float calcularLitros() {
        return valorPagamento / precoPorLitro;
    }
}
