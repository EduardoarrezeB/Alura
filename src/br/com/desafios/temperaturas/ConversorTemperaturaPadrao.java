package br.com.desafios.temperaturas;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    private double celsius;
    private double fahrenheit;

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    @Override
    public double celsiusParaFahrenheit() {
        return (celsius * 1.8) + 32;
    }

    @Override
    public double fahrenheitParaCelsius() {
        return (fahrenheit - 32) / 1.8;
    }
}
