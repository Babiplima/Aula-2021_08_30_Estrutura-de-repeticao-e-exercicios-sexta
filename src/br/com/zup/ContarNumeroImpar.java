package br.com.zup;

import java.util.Scanner;

public class ContarNumeroImpar {
    public static void main(String[] args) {
        //Instaciar o Scanner

        Scanner leitor = new Scanner(System.in);
        double contador = 1;
        System.out.println("Digite a quantidade de números que você deseja ");
        int qtdDeRepeticao = leitor.nextInt();
        double lendoDoUsuario;
        double soma = 0;
        int contadorNumerosImpar = 0;

        while (contador <= qtdDeRepeticao) {
            System.out.println("Digite um número" + contador);
            lendoDoUsuario = leitor.nextDouble();

            if (lendoDoUsuario % 2 == 1){
                contadorNumerosImpar+=1;
            }
            contador ++;

        }
        System.out.println(contadorNumerosImpar);
    }
}
