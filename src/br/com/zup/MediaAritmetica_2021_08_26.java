package br.com.zup;

import java.util.Scanner;

public class MediaAritmetica_2021_08_26 {

    public static void main(String[] args) {

        //Instanciando o Scanner
        Scanner leitor = new Scanner(System.in);

        //Notas do aluno

        System.out.println("Por favor digite a nota 1 ");
        double nota1 = leitor.nextDouble();

        System.out.println("Por favor digite a nota 2 ");
        double nota2 = leitor.nextDouble();

        // Operação da soma das notas
        double soma = nota1 + nota2;

        // Operação de média aritmética

        double media = soma / 2;

        //Exibindo o resultado da média do aluno

        if (media >= 7 & media <10) {
            System.out.println("Aprovado");
        }
        else if (media < 7) {
            System.out.println("Reprovado");
        }
        else if (media == 10) {
            System.out.println("Aprovado com distinção");
        }
    }
    }
