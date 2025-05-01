package br.com.desafios.tabuadas;

public class TabuadaMultiplacacao implements Tabuada{
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int mostrarTabuada() {
        for (int x = 0; x <= 10; x++){
            System.out.println(this.numero * x);
        }
        return 0;
    }
}
