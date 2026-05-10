package br.com.teh.abstracao_encapsulamento.exercicio01;

public class Boleto {
    private int numeroBoleto;
    private ContaBancaria conta;
    private double valor;

    public Boleto(int numeroBoleto, ContaBancaria conta, double valor){
        this.numeroBoleto = numeroBoleto;
        this.conta = conta;
        this.valor = valor;
    }
    public int getNumeroBoleto() {
        return numeroBoleto;
    }
    public void setNumeroBoleto(int numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    public double getValor() {
        return this.valor = valor;
    }

    public void imprimirBoleto(){
        System.out.println("Boleto..." +  this.numeroBoleto);
        System.out.print("Valor: R$" +  this.valor);
    }
}

