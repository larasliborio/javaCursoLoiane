package com.loiane.cursojava.classes;

public class testeFlor {
    public static void main(String[] args) {

      flor orkiFlor = new flor();
      orkiFlor.tipo = "orchidaceae";
      orkiFlor.nome = "orquídea";

      orkiFlor.valor = 10;
      orkiFlor.durabilidade = 12;
      orkiFlor.intensidade = 5.0;

        System.out.println(orkiFlor.tipo);
        System.out.println(orkiFlor.nome);
        System.out.println(orkiFlor.valor);
        System.out.println(orkiFlor.durabilidade + " messes");
        System.out.println(orkiFlor.intensidade);


}
}