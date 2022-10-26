package com.loiane.cursojava.aula19;

public class Vetores {
    public static void main(String[] args) {

        double tempodia001 = 31.3;
        double tempodia002 = 32;
        double tempodia003 = 33.7;
        double tempodia004 = 34;
        double tempodia005 = 33.1;

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("o valor da temperatura do dia 3  é :" + temperaturas[2]);
        System.out.println("Tamanho do array :" + temperaturas.length);
        System.out.println(" valores do array");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("o valor da temperatura do dia " + (i + 1) + "é :" + temperaturas[i]);

        }

        for (double temp : temperaturas) {
            System.out.println(temp);

        }
    }
}
