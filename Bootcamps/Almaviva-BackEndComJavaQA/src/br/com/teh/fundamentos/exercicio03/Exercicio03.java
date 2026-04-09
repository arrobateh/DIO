package br.com.teh.fundamentos.exercicio03;

import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int base;
        int altura;
        int resultado;

        System.out.print("Digite o tamanho da base do retangulo: ");
        base = leia.nextInt();

        System.out.print("Digite a altura do retangulo: ");
        altura = leia.nextInt();

        resultado = base * altura;

        System.out.printf("%scm x %scm = %scm²", base, altura, resultado);
    }
}