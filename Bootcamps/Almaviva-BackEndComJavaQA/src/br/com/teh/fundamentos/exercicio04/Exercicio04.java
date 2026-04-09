package br.com.teh.fundamentos.exercicio04;

import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String p1Nome;
        int p1Idade;
        String p2Nome;
        int p2Idade;
        int diferenca;

        System.out.print("Digite o nome da primeira pessoa: ");
        p1Nome = leia.next();
        System.out.print("Digite a idade da primeira pessoa: ");
        p1Idade = leia.nextInt();

        System.out.print("Digite o nome da segunda pessoa: ");
        p2Nome = leia.next();
        System.out.print("Digite a idade da segunda pessoa: ");
        p2Idade = leia.nextInt();

        diferenca = Math.subtractExact(p1Idade, p2Idade);
        System.out.printf("A diferenca entre as idades e: %s ", diferenca);
    }
}