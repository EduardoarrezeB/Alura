package br.com.desafios.calculodeareas;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    private double largura;
    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }


    @Override
    public double calcularArea() {
        return this.largura * this.largura;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * this.largura;
    }
}
