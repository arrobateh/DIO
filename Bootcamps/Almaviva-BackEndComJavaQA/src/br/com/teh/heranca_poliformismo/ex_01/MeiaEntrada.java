package br.com.teh.heranca_poliformismo.ex_01;

public class MeiaEntrada extends Ingresso {

    private double valorMeia;

    public MeiaEntrada() {
    }

    public MeiaEntrada(double valor, String nomeFilme, String idiomaFilme, double valorMeia) {
        super(valor, nomeFilme, idiomaFilme);
        this.valorMeia = valorMeia;
    }

    public double getValorMeia() {
        return super.getValor() / 2;
    }

    public void setValorMeia(double valorMeia) {
        this.valorMeia = valorMeia;
    }
}