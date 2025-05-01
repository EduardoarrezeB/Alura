import br.com.desafios.produtos.Produto;
import br.com.desafios.produtos.Servico;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Servico clienteNormal = new Servico();
        Servico clienteVip = new Servico();

        produto.setPrecoProduto(120);
        clienteNormal.setClienteVip(false);
        clienteVip.setClienteVip(true);

        System.out.println(produto.calculaPrecoFinal());
        System.out.println(clienteNormal.calculaPrecoFinal());
        System.out.println(clienteVip.calculaPrecoFinal());
    }
}