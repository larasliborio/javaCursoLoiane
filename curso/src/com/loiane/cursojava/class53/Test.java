package com.loiane.cursojava.class53;

public class Test {

    public static void main(String[]args) {
        usandoConstantes();
    }
    private static void  usandoConstantes() {
        int segunda = DayWeekConstants.SEGUNDA;
        int terça = DayWeekConstants.TERCA;
        int quarta = DayWeekConstants.QUARTA; 
        int quinta = DayWeekConstants.QUINTA;
        int sexta = DayWeekConstants.SEXTA;
        int sábado = DayWeekConstants.SABADO;
        int domingo = DayWeekConstants.DOMINGO;

        System.out.println("teste utilizando consantes no java ");

imprimeDiaSemana(segunda);
imprimeDiaSemana(terça);
imprimeDiaSemana(quarta);
imprimeDiaSemana(quinta);
imprimeDiaSemana(sexta);
imprimeDiaSemana(sábado);
imprimeDiaSemana(domingo);

    }
private static void  imprimeDiaSemana(int dia) {
    switch (dia){
        case 1:
        System.out.println("Segunda-feira");
        break;
        case 2:
        System.out.println("Terça-feira");
        break;
        case 3:
        System.out.println("Quarta-feira");
        break;
        case 4:
        System.out.println("Quinta-feira");
        break;
        case 5:
        System.out.println("Sexta-feira");
        break;
        case 6:
        System.out.println("Sábado");
        break;
        case 7:
        System.out.println("Domingo");
        break;
    }
}
private static void usandoEnum() {
DayWeek segunda =   DayWeek.SEGUNDA;
DayWeek terça =   DayWeek.TERCA;
DayWeek quarta =   DayWeek.QUARTA;
DayWeek quinta =   DayWeek.QUINTA;
DayWeek sexta =   DayWeek.SEXTA;
DayWeek sábado =   DayWeek.SABADO;
DayWeek domingo =   DayWeek.DOMINGO;

System.out.println("teste utilizando enum no java ");

}
}
