package com.loiane.cursojava.classes;

public class classe {

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

    boneca barbiBoneca = new boneca();
    barbiBoneca.tipo = "boneca";
    barbiBoneca.nome = "barbie";

    barbiBoneca.valor = 25;
    barbiBoneca.durabilidade = 12;
    barbiBoneca.idade = 20;

    System.out.println(barbiBoneca.tipo);
    System.out.println(barbiBoneca.nome);
    System.out.println(barbiBoneca.valor);
    System.out.println(barbiBoneca.durabilidade + " anos" + " (depende da pessoa)");
    System.out.println(barbiBoneca.idade);

    cafeteira nesCafeteira = new cafeteira();
    nesCafeteira.tipo = "cafeteira";
    nesCafeteira.nome = "nescafé";

    nesCafeteira.valor = 250;
    nesCafeteira.durabilidade = 10;
    nesCafeteira.suporta = 1;

    System.out.println(nesCafeteira.tipo);
    System.out.println(nesCafeteira.nome);
    System.out.println(nesCafeteira.valor);
    System.out.println(nesCafeteira.durabilidade + " anos" + " (depende da pessoa)");
    System.out.println(nesCafeteira.suporta + " l");

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

    tv sansungTv = new tv();
    sansungTv.tipo = "tv";
    sansungTv.nome = "sansung";

    sansungTv.valor = 3500;
    sansungTv.durabilidade = 10;
    sansungTv.k = "4 k";

    System.out.println(sansungTv.tipo);
    System.out.println(sansungTv.nome);
    System.out.println(sansungTv.valor);
    System.out.println(sansungTv.durabilidade + " anos" + " (depende da pessoa)");
    System.out.println(sansungTv.k);

    tv filipsTv = new tv();
    filipsTv.tipo = "tv";
    filipsTv.nome = " filips";

    filipsTv.valor = 3500;
    filipsTv.durabilidade = 10;
    filipsTv.k = "4 k";

    System.out.println(filipsTv.nome);

   



  }
}
