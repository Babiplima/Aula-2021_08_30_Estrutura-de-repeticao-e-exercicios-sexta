package br.com.zup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       //Instanciando o Scanner
        Scanner leitor = new Scanner(System.in);

        //Recebendo os números pelos usuários

        System.out.println("Por favor digite o número 1 ");
        double numero1 = leitor.nextDouble();

        System.out.println("Por favor digite o número 2 ");
        double numero2 = leitor.nextDouble();

        if (numero1 > numero2){
            System.out.println("Número 1 é maior que o número 2");
        }
        else {
            System.out.println("Número 2 é maior que o número 1");
        }


    }
}
