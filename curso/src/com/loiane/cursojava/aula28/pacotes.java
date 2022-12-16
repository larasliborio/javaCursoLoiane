package com.loiane.cursojava.aula28;

import com.loiane.cursojava.aula18.*;
import com.loiane.cursojava.aula19.*;
import com.loiane.cursojava.aula20_1.*;
import com.loiane.cursojava.aula26.carro;


public class pacotes {

    public static void main(String[] args) {

        carro carro ;

        carro carro2;

        boneca barbiBoneca = new boneca();
        barbiBoneca.tipo = "boneca";
        barbiBoneca.nome = "barbie";
  
        barbiBoneca.valor = 25;
        barbiBoneca.durabilidade = 12;
        barbiBoneca.idade = 20;
  
          System.out.println(barbiBoneca.tipo);
          System.out.println(barbiBoneca.nome);
          System.out.println(barbiBoneca.valor);
          System.out.println(barbiBoneca.durabilidade +" anos" +" (depende da pessoa)");
          System.out.println(barbiBoneca.idade);



    }
}