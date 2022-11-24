package com.loiane.cursojava.classes_3;

public class testeBoneca {
    public static void main(String[] args) {

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
