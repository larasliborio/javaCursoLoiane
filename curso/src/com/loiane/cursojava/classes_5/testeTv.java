package com.loiane.cursojava.classes_5;

public class testeTv {
    public static void main(String[] args) {

        tv nesCafeteira = new tv();
        nesCafeteira.tipo = "tv";
         nesCafeteira.nome = "sansung";
    
          nesCafeteira.valor = 3500;
         nesCafeteira.durabilidade = 10 ;
          nesCafeteira.k = "4 k";
    
            System.out.println(nesCafeteira.tipo);
            System.out.println(nesCafeteira.nome);
            System.out.println(nesCafeteira.valor);
            System.out.println(nesCafeteira.durabilidade +" anos" +" (depende da pessoa)");
            System.out.println(nesCafeteira.k);
    
    
    }
}
