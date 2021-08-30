package br.com.zup;

import java.util.Scanner;

public class SalarioReajuste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor, digite seu salário");

        double salarioAtual = leitor.nextDouble();
        double novoSalario;
        double valorAumento = 0;

        //Valor salario até R$ 280

        if (salarioAtual > 0 & salarioAtual <= 280) {
        System.out.println(" Você recebeu um aumento de 20%. ");
        valorAumento = salarioAtual * 0.2;
        }
        else if (salarioAtual > 280 & salarioAtual <= 700) {
        System.out.println(" Você recebeu um aumento de 15%. ");
        valorAumento = salarioAtual * 0.15;
        }
         else if (salarioAtual > 700 & salarioAtual <= 1500) {
         System.out.println(" Você recebeu um aumento de 10%. ");
         valorAumento = salarioAtual * 0.10;
         }
        else if (salarioAtual > 1500) {
        System.out.println(" Você recebeu um aumento de 5%. ");
        valorAumento = salarioAtual * 0.05;
        }
        else {
        System.out.println("Por favor, digite um valor maior que 0");
        }

        novoSalario = salarioAtual + valorAumento;

        System.out.println("O salário atual da pessoa é: R$ " + salarioAtual);
        System.out.println("O valor do seu aumento será: R$ " + valorAumento);
        System.out.println( "O seu novo salário será: R$ " + novoSalario);
    }

}
