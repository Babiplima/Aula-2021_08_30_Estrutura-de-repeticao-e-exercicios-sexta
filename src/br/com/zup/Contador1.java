package br.com.zup;

import java.util.Scanner;

public class Contador1 {
    public static void main(String[] args) {
        //Instaciar o Scanner

        Scanner leitor = new Scanner(System.in);
        double contador = 1;
        System.out.println("Digite a quantidade de números que você deseja ");
        int qtdDeRepeticao = leitor.nextInt();
        double lendoDoUsuario;
        double soma = 0;

        while (contador <= qtdDeRepeticao) {
            System.out.println("Digite um número" + contador);
            lendoDoUsuario = leitor.nextDouble();

            soma = soma + lendoDoUsuario;
            System.out.println("SOMA DEPEOIS DE LER " + contador + "NÚMEROS " + soma);

            contador ++;
        }

        double media = soma/qtdDeRepeticao;

        System.out.println(" SOMA TOTAL " + soma);
        System.out.println(" A média dos números é " + media);
    }
}


