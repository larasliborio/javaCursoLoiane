package com.loiane.cursojava.aula13;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class operadoresArimeticos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "está é ";
        String segundoNome = "uma string concatenada ";
        String terceiraNome = primeiroNome + segundoNome;
        System.out.println(terceiraNome);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);

        System.out.println(resultado++);
        // mesma coisa que
        // System.out.println(resultado);
        // resultado = resultado + 1;
        // resultado +=1;

        System.out.println(++resultado);
        // mesma coisa que
        // resultado +=1;
        // System.out.println(resultado);

        resultado--;
        System.out.println(resultado);

        System.out.println(--resultado);
        System.out.println(resultado--);

    }

}
