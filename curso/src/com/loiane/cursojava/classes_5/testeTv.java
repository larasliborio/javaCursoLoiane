package com.loiane.cursojava.classes_5;

public class testeTv {
    public static void main(String[] args) {

        tv sansungTv = new tv();
        sansungTv.tipo = "tv";
         sansungTv.nome = "sansung";
    
          sansungTv.valor = 3500;
         sansungTv.durabilidade = 10 ;
          sansungTv.k = "4 k";
    
            System.out.println(sansungTv.tipo);
            System.out.println(sansungTv.nome);
            System.out.println(sansungTv.valor);
            System.out.println(sansungTv.durabilidade +" anos" +" (depende da pessoa)");
            System.out.println(sansungTv.k);
    
    

            tv filipsTv = new tv();
             filipsTv.tipo = "tv";
             filipsTv.nome = " filips";
        
             filipsTv .valor = 3500;
             filipsTv.durabilidade = 10 ;
              filipsTv.k = "4 k";
        
               
                System.out.println(filipsTv.nome);
              
        





    }
}
