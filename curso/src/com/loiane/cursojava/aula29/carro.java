package com.loiane.cursojava.aula29;

public class carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capConbustivel;
    double consumoConbustivel;

    carro() {
        System.out.println("carro foi instanciado");
        numPassageiros = 4;
    }

    carro(String marca_, String modelo_, int numPassageiros_, double capConbustivel_, double consumoConbustivel_) {
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros;
        capConbustivel = capConbustivel_;
        consumoConbustivel = consumoConbustivel_;

    }

    void exibirautonomia() {
        System.out.println("a autonomia do carro é : " + capConbustivel * consumoConbustivel + "km");
    }

    double obterAutonomia() {
        System.out.println("obter");
        return capConbustivel * consumoConbustivel;

    }

    double calcularCapcombustivel(double km) {
        double qntddcombustivel = km / consumoConbustivel;
        return qntddcombustivel;
    }
}
