package br.com.zup;

import java.util.Scanner;

public class ProdutoMaisBarato {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Valor do produto 1 ");
        double produto1 = leitor.nextDouble();

        System.out.println("Valor do produto 2 ");
        double produto2 = leitor.nextDouble();

        System.out.println("Valor do produto 3 ");
        double produto3 = leitor.nextDouble();

        if (produto1 < produto2 & produto1 < produto3) {
            System.out.println("O produto 1 é mais barato");
        } else if (produto2 < produto3 & produto2 < produto1) {
            System.out.println("O produto 2 é mais barato");
        } else if (produto3 < produto2 & produto3 < produto1) {
            System.out.println("O produto 3 é mais barato");
        }
    }
}

