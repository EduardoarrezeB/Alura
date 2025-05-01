package br.com.desafios.livraria;

public class ProdutoFisico implements Calculavel{
    private double precoProdutoFisico;
    private double descontoProdFisico = 0.54;

    public void setPrecoProdutoFisico(double precoProdutoFisico) {
        this.precoProdutoFisico = precoProdutoFisico;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoProdutoFisico - precoProdutoFisico * descontoProdFisico;
    }
}
