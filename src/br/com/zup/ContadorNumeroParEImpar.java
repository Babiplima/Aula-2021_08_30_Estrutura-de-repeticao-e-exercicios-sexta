package br.com.zup;

import java.util.Scanner;

public class ContadorNumeroParEImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double contador = 1;
        System.out.println("Digite a quantidade de números que você deseja ");
        int qtdDeRepeticao = leitor.nextInt();
        double lendoDoUsuario;
        double soma = 0;
        int contadorNumerosPares = 0;
        int contadorNumerosImpar = 0;


        while (contador <= qtdDeRepeticao) {
            System.out.println("Digite um número" + contador);
            lendoDoUsuario = leitor.nextDouble();

            if (lendoDoUsuario % 2 == 0) {
                contadorNumerosPares += 1;
            } else {
                contadorNumerosImpar += 1;
            }

            contador ++;
        }
        System.out.println("A quantidade de números pares são "+ contadorNumerosPares);
        System.out.println("A quantidade de números impar são "+ contadorNumerosImpar);

    }
}