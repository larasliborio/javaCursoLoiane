package com.loiane.cursojava.aula26;

public class carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capConbustivel;
    double consumoConbustivel;

    void exibirautonomia() {
        System.out.println("a autonomia do carro é : " + capConbustivel * consumoConbustivel + "km");
    }

    double obterAutonomia() {
        System.out.println("obter");
        return capConbustivel*consumoConbustivel;
    
    }

    
}
