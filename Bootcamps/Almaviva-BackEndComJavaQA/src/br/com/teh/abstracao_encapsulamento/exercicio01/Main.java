package br.com.teh.abstracao_encapsulamento.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao;
        ContaBancaria conta = new ContaBancaria (1234, 500);
        System.out.println("Conta cadastrada com sucesso.");
        Boleto boleto1 = new Boleto(123, conta, 200);
        boleto1.imprimirBoleto();
        do {
            System.out.append("\n======= MENU =======\n")
                      .append("1 - Depositar\n")
                      .append("2 - Sacar\n")
                      .append("3 - Consultar Saldo\n")
                      .append("4 - Pagar Boleto\n")
                      .append("5 - Sair\n")
                      .append("Escolha um opcao: ");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do deposito: R$ ");
                    double valorDeposito = leia.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: R$ ");
                    double valorSaque = leia.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("Consultando o saldo...");
                    System.out.print("Saldo = R$" + conta.getSaldo());
                    break;
                case 4:
                    System.out.println("Pagando boleto numero: " + boleto1.getNumeroBoleto());
                    System.out.println("Valor = R$ " + boleto1.getValor());
                    conta.pagarBoleto(boleto1.getValor());
                    break;
                case 5:
                    System.out.print("Saindo...");
                    break;

            }

        } while (opcao != 5);



    }
}