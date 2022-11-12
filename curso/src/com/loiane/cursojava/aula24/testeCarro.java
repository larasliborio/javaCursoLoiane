package com.loiane.cursojava.aula24;

public class testeCarro {
    public static void main(String[] args) {

        carro van = new carro();
        van.marca = "fiat";
        van.modelo = "ducato";

        van.numPassageiros = 10;
        van.capConbustivel = 100;
        van.consumoConbustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        carro fusca = new carro();
        fusca.marca = "vokswagen";
        fusca.modelo = "fusca";

        fusca.numPassageiros = 4;
        fusca.capConbustivel = 30;
        fusca.consumoConbustivel = 0.15;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);

    }
}
