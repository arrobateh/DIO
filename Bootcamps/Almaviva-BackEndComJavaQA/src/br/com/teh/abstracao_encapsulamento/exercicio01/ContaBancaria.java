package br.com.teh.abstracao_encapsulamento.exercicio01;

import javax.swing.plaf.basic.BasicDesktopIconUI;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;
    private double chequeEspecial;

    public ContaBancaria(int numeroConta, double deposito) {
        this.numeroConta = numeroConta;
        this.saldo = deposito;
        if (deposito <= 500) {
            chequeEspecial = 50.00;
            saldo = saldo + chequeEspecial;
        } else {
            chequeEspecial = deposito * 0.50;
            saldo = saldo + chequeEspecial;
        }
    }

    public double getSaldo(){
        return this.saldo = saldo;
    }
    public double getChequeEspecial(){
        return this.chequeEspecial;
    }
    public int getNumeroConta(){
        return this.numeroConta;
    }

    public void depositar(double valor){
        if (valor <= 0){
            System.out.print("Valor incorreto.");
        } else {
            this.saldo = this.saldo + valor;
            System.out.print("Deposito no valor de R$ " + valor + " realizado com sucesso.");
        }
    }

    public void sacar(double valor){
        if (valor <= 0){
            System.out.print("Valor incorreto.");
        } else {
            this.saldo = this.saldo - valor;
            System.out.print("Saque no valor de R$ " + valor + " realizado com sucesso.\n");
        }
    }
    public void pagarBoleto(double valor) {
        if (valor <= 0){
            System.out.print("Valor incorreto.");
        } else {
            this.saldo = this.saldo - valor;
            System.out.println("Boleto pago no valor de R$ " + valor + " realizado com sucesso.");
        }
    }
}