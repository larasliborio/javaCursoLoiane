package com.loiane.cursojava.aula25;

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

    van.exibirautonomia();
      double autonomia = van.obterAutonomia();
      System.out.println("a autonomia do carro é : " + autonomia);
      System.out.println("a autonomia do carro é : " + van.obterAutonomia());
    }
}
