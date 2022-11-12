package com.loiane.cursojava.aula24;

public class carro {

  String marca;
  String modelo;
  int numPassageiros;
  double capConbustivel;
  double consumoConbustivel;

  void exibirAutonomia() {

    System.out.println(" A autonomia do carro é " + capConbustivel * consumoConbustivel + "km");

  }

}
