package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       /* System.out.println("digite seu nome conpleto");
        String nomeConpleto = scan.nextLine();
        System.out.println("seu nome conpleto é: " + nomeConpleto);


        System.out.println("digite seu primeiro nome")
        string primeiroNome = scan.next();
        System.out.println("seu primeiro nome é : " primeiroNome);*/

        System.out.println("digite sua idade ");
        int Idade = scan.nextInt();
        System.out.println("sua idade é : " + Idade);

        System.out.println("digite sua altura");
        double Altura = scan.nextDouble();
        System.out.println("sua altura é :" + Altura);

        System.out.println(
                "digete seu primeiro nome,idade,quantidade de filhos,altura e se tem ou não bichinhos de estimação");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtsf = scan.nextByte();
        float altura = scan.nextFloat();
        boolean tempet = scan.nextBoolean();

        System.out.println("você digitou os seguntes valores");
        System.out.println("primeiro nome " + primeiroNome);
        System.out.println("idade " + idade);
        System.out.println("quantos filhos tem" + qtsf);
        System.out.println("altura" + altura);
        System.out.println("tem pet?" + tempet);
        
        
    }
}
