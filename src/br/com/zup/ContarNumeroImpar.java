package br.com.zup;

import java.util.Scanner;

public class ContarNumeroImpar {
    public static void main(String[] args) {

        //Variáveis

        double contador = 0;
        double qtdNumeros = 0;
        double numerosRecebido = 0;
        double maiorNumero = 0;
        double menorNumero = 0;

        //Instaciar o Scanner

        Scanner leitor = new Scanner(System.in);

        //Pedindo o número ao usuário

        System.out.println("Digite a quantidade de números que você deseja ");
        qtdNumeros = leitor.nextDouble();

        //Comparando número maior

        while (contador < qtdNumeros) {
            System.out.println("Digite o número ");
            numerosRecebido = leitor.nextDouble();
            if (numerosRecebido > maiorNumero) {
                maiorNumero = numerosRecebido;
            }
            contador++;
        }
        System.out.println("Este é o maior número " + maiorNumero);

        //Comparando número menor

        while (contador > qtdNumeros) {
            System.out.println("Digite o número ");
            numerosRecebido = leitor.nextDouble();
            if (numerosRecebido < menorNumero) {
                menorNumero = numerosRecebido;
            }
            contador++;
        }
        System.out.println("Este é o menor número " + menorNumero);
    }
}