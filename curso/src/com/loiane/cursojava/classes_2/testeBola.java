package com.loiane.cursojava.classes_2;

import com.loiane.cursojava.classes.flor;

public class testeBola {
    public static void main(String[] args) {

        bola fifa = new bola();
        fifa.editora = "fifa";
        fifa.nomed = "fifa wold cup 2022";

        fifa.quantidade = 4;
        fifa.preço = 10;
        fifa.capasidade = 1000000;  

        System.out.println(fifa.editora);
        System.out.println(fifa.nomed);
        System.out.println(fifa.quantidade);
        System.out.println(fifa.preço);
        System.out.println(fifa.capasidade);



}
}