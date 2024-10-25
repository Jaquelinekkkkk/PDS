package Aula6;

public class Retangulo {
    private float baseRetangulo;
    private float alturaRetangulo;

    public Retangulo(double base, double altura) {
        baseRetangulo = (float) base;
        alturaRetangulo = (float) altura;
    }

    public float calcularPerimetro() {
        return 2 * (baseRetangulo + alturaRetangulo);
    }

    public float calcularArea() {
        return baseRetangulo * alturaRetangulo;
    }
}
