package com.loiane.cursojava.classes_4;

public class testeCafeteira {
 
    public static void main(String[] args) {

       cafeteira nesCafeteira = new cafeteira();
       nesCafeteira.tipo = "cafeteira";
        nesCafeteira.nome = "nescafé";
   
         nesCafeteira.valor = 250;
        nesCafeteira.durabilidade = 10;
         nesCafeteira.suporta = 1;
   
           System.out.println(nesCafeteira.tipo);
           System.out.println(nesCafeteira.nome);
           System.out.println(nesCafeteira.valor);
           System.out.println(nesCafeteira.durabilidade +" anos" +" (depende da pessoa)");
           System.out.println(nesCafeteira.suporta + " l");
   
   
   }
}
