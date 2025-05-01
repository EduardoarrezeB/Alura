package br.com.desafios.livraria;

public class Livro implements Calculavel{
    private double precoProduto;
    private double descontoLivro = 0.18;

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoProduto - precoProduto * descontoLivro;
    }
}
