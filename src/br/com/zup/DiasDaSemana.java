package br.com.zup;

import java.util.Scanner;

public class DiasDaSemana {
    private static String domingo;

    public static void main(String[] args) {
        //Instanciando o scanner

        Scanner leitor = new Scanner(System.in);
        String DiasDaSemana = domingo;
        //int terça = 3;
        //int quarta = 4;
        //int quinta = 5;
        //int sexta = 6;
        //int sabado = 7;

        //Usuário digita dia da semana e ver qual é o dia

        System.out.println("Por favor, digite um número");
        double numeroDaSemana = leitor.nextDouble();

        if (numeroDaSemana == 1) {
            System.out.println("O dia da semana é " + domingo);
        } else if (numeroDaSemana == 2) {
           // System.out.println("O dia da semana é " + segunda);
        } else if (numeroDaSemana == 3) {
         //   System.out.println("O dia da semana é " + terça);
        } else if (numeroDaSemana == 4) {
          //  System.out.println("O dia da semana é " + quarta);
        } else if (numeroDaSemana == 5) {
          //  System.out.println("O dia da semana é " + quinta);
        } else if (numeroDaSemana == 6) {
          //  System.out.println("O dia da semana é " + sexta);
        } else if (numeroDaSemana == 7) {
          //  System.out.println("O dia da semana é " + sabado);
        }
    }
}
