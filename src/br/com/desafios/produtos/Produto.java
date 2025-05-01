package br.com.desafios.produtos;

public class Produto implements Vendavel{
    private double precoProduto;
    private double descontoSimples = 0.1;

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public double calculaPrecoFinal() {
        return precoProduto - precoProduto * descontoSimples;
    }
}
