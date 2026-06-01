package br.com.teh.heranca_poliformismo.ex_01;

public class IngressoFamilia extends Ingresso {

    private int numeroPessoa;

    private double valorIngressoFamilia;

    public IngressoFamilia() {}

    public IngressoFamilia(double valor,
                           String nomeFilme,
                           String idiomaFilme,
                           int numeroPessoa,
                           double valorIngressoFamilia ) {
        super(valor, nomeFilme, idiomaFilme);
        this.numeroPessoa = numeroPessoa;
        this.valorIngressoFamilia = valorIngressoFamilia;
    }

    public int getNumeroPessoa() {
        return numeroPessoa;
    }

    public void setNumeroPessoa(int numeroPessoa) {
        this.numeroPessoa = numeroPessoa;
    }

    public double getValorIngressoFamilia() {
        if (numeroPessoa >= 3){
            return (super.getValor() * numeroPessoa) * 0.5;
        } else {
            return super.getValor() * numeroPessoa;
        }
    }

    public void setValorIngressoFamilia(double valorIngressoFamilia) {
        this.valorIngressoFamilia = valorIngressoFamilia;
    }
}
