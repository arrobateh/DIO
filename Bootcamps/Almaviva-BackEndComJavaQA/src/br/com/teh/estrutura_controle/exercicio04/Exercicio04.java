package br.com.teh.estrutura_controle.exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String [] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double numUm = leia.nextDouble();

        double numDois;

        do {
            System.out.print("Digite outro numero: ");
            numDois = leia.nextDouble();

        } while (numDois % numUm == 0);
    }
}
