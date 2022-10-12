package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a sua idade");

        int idade = scan.nextInt();

        if (idade >= 18) {

            System.out.println("é maior de idade.");

        } else {

            System.out.println("Não é maior de idade. ");
        }

        System.out.println("Entre com o valor do item");
        double valor = scan.nextDouble();

        if (valor <= 10) {

            System.out.println("é barato pode comprar.");

        } else if (valor > 10 && valor < 15) {
            System.out.println(" você pode pedir um desconto.");
        } else if (valor <= 15 && valor < 17) {
            System.out.println(" você pode pesquisar mais.");
        } else {
            System.out.println(" muito caro.");
        }

    }
}
