package br.com.teh.estrutura_controle.exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numUm;
        System.out.print("Digite um numero: ");
        numUm = leia.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print(numUm + " x " + i + " = " + (numUm * i) + "\n");
        }
    }
}
