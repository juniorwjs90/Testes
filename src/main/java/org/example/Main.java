package org.example;
import java.util.Scanner;

public class Main extends Operacoes {
    public static void main(String[] args) {
        float num1, num2;
        Scanner sc1 = new Scanner(System.in);
        Operacoes operacoes = new Operacoes();

        System.out.println("Escolha uma opção:\n" +
                "1 - Somar;\n" +
                "2 - Dividir;\n" +
                "3 - Subtrair;\n" +
                "4 - Multiplicar;\n" +
                "5 - Sair.");
        int opcao = sc1.nextInt();

        if (opcao <= 4) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o primeiro número: ");
            num1 = sc.nextInt();
            System.out.println("Digite o segundo número: ");
            num2 = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("A soma dos dois números è: " + operacoes.somar(num1, num2));
                    break;
                case 2:
                    System.out.println("O valor resultante da divisão é: " + operacoes.dividir(num1, num2));
                    break;
                case 3:
                    System.out.println("O resultado da subtração é: " + operacoes.subtrair(num1, num2));
                    break;
                case 4:
                    System.out.println("O resultado da multiplicação é: " + operacoes.multiplicar(num1, num2));
                    break;
            }
        }else if (opcao == 5) {
                System.out.println("Tchau.");
            } else
                System.out.println("Opção inválida.");
        }
}