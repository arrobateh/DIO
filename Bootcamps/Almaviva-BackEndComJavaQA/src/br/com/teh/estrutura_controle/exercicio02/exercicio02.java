package br.com.teh.estrutura_controle.exercicio02;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double altura;
        double peso;

        System.out.print("Digite sua altura: ");
        altura = leia.nextDouble();
        System.out.print("Digite seu peso: ");
        peso = leia.nextDouble();
        double imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.print("Abaixo do peso !");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.print("Peso ideal !");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.print("Levemente acima do peso !");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.print("Obesidade grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.print("Obesidade grau II (Severa)");
        } else if (imc >= 40) {
            System.out.print("Obesidade grau III (Mórbida)");
        }
    }
}
