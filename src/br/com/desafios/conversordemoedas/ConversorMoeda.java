package br.com.desafios.conversordemoedas;

public class ConversorMoeda implements ConversaoFinanceira {
    private double dolar;

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    @Override
    public double converterDolarParaReal() {
        return this.dolar * 4.80;
    }
}
