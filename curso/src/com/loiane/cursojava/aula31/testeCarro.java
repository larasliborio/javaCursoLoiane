package com.loiane.cursojava.aula31;

public class testeCarro {
    public static void main(String[] args) {
        carro van = new carro();
        van.marca = "fiat";
        van.modelo = "ducato";
    
       //s van.numPassageiros = 10;
        van.capConbustivel = 100;
     //   van.consumoConbustivel = 0.2;

        System.out.println(van.numPassageiros);

        carro van2 =new carro("fiat","ducato",10,100,0.2);
        System.out.println(van2.marca);
        System.out.println(van2.modelo);
        System.out.println(van2.numPassageiros);
        System.out.println(van2.capConbustivel);
       // System.out.println(van2.consumoConbustivel);




    }
}

