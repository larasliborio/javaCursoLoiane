package com.loiane.cursojava.aula30;

public class carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capConbustivel;
    double consumoConbustivel;

    public carro(String marca, String modelo, int numPassageiros, double capConbustivel, double consumoConbustivel) {
      this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capConbustivel = capConbustivel;
        this. consumoConbustivel = consumoConbustivel;
    }

    public carro() {
    }

    public carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("chamando o construtor com 3 pârametros"); 
    }

    public carro(String marca, String modelo) {
        this("fiat", "ducato", 10);
        System.out.println("chamando o construtor com 2 pârametros");        

    }

    void exibirautonomia() {
        System.out.println("a autonomia do carro é : " + this.capConbustivel * this.consumoConbustivel + "km");
    }

    double obterAutonomia() {
        System.out.println("obter");
        return this.capConbustivel * this.consumoConbustivel;

    }

    double calcularCapcombustivel(double km) {
        double qntddcombustivel = km / this.consumoConbustivel;
        return qntddcombustivel;
    }
}
