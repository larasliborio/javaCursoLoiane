package com.loiane.cursojava.class54;

public class Data {

    public static final char[] setDia = null;
    public static char[] Dia;
    private int dia;
    private int mes;
    private int ano;
    private DiaSemana diaSemana;

    public  Data(){
        super();
    }
    public Data(int dia,int mes,int ano,DiaSemana diaSemana){

    super();
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
    this.diaSemana = diaSemana;
    }
    public int getDia(){
return dia;
    }
    public int setDia(int dia){
        return this.dia = dia;
}
    public int getMes(){
return mes;
    }
    public int setMes(int mes){
        return this.mes = mes;
}
    public int getAno(){
return ano;
    }
    public int setAno(int ano){
        return this.ano = ano;
}
    public DiaSemana getDiaSemana(){
return diaSemana;
    }
    public DiaSemana setDisaSemana(int DiaSemana){
        return this.diaSemana = diaSemana;
}


















}
