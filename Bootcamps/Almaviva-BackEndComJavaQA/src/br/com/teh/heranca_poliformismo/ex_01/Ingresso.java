package br.com.teh.heranca_poliformismo.ex_01;

public class Ingresso {

    private double valor;

    private String nomeFilme;

    private String idiomaFilme;

    public Ingresso() {
    }

    public Ingresso(double valor, String nomeFilme, String idiomaFilme) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.idiomaFilme = idiomaFilme;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getIdiomaFilme() {
        return idiomaFilme;
    }

    public void setIdiomaFilme(String idiomaFilme) {
        this.idiomaFilme = idiomaFilme;
    }
}
