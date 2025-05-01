package br.com.desafios.produtos;

public class Servico implements Vendavel{
    private double precoServico = 150;
    private boolean clienteVip;

    public void setClienteVip(boolean clienteVip) {
        this.clienteVip = clienteVip;
    }

    @Override
    public double calculaPrecoFinal() {
        if (clienteVip){
            return precoServico - precoServico * 0.2;
        } else {
            return precoServico;
        }
    }
}
