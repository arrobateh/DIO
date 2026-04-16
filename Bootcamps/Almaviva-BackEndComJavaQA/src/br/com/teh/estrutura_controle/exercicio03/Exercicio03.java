package br.com.teh.estrutura_controle.exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numUm;
        int numDois;
        int opcao;

        System.out.print("Digite um numero: ");
        numUm = leia.nextInt();
        System.out.print("Digite outro numero maior que o anterior: ");
        numDois = leia.nextInt();

        System.out.println("OPCOES");
        System.out.println("1 - Impar");
        System.out.println("2 - Par");
        System.out.print("Escolha uma opção: ");
        opcao = leia.nextInt();

        switch (opcao) {
            case 1:
                for(int i = numDois; i >= numUm; i--){
                    if (i % 2 != 0){
                        System.out.print(i + " ");
                    }
                }
                break;
            case 2:
                for(int i = numDois; i >= numUm; i--){
                    if (i % 2 == 0){
                        System.out.print(i + " ");
                    }
                }
        }
    }
}
