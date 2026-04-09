package br.com.teh.exercicio01;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = leia.nextLine();

        System.out.print("Digite sua idade: ");
        idade = leia.nextInt();

        System.out.printf("Ola %s, voce tem %s anos.", nome, idade);

        leia.close();
    }
}