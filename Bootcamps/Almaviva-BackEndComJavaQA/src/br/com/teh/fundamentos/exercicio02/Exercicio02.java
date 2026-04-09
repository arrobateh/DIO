package br.com.teh.fundamentos.exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int tamanho;
        int resultado;

        System.out.print("Digite o tamanho do lado do quadrado: ");
        tamanho = leia.nextInt();

        resultado = tamanho * tamanho;

        System.out.printf("%sm x %sm = %sm²", tamanho, tamanho, resultado);
    }
}