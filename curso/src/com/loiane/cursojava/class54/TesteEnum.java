package com.loiane.cursojava.class54;

import com.loiane.cursojava.class54.Formulario.Genero;

public class TesteEnum {
        public static void main(String[]args) {

        DiaSemana dia =DiaSemana.SEGUNDA ;        
                System.out.println(dia.toString() + "-" + dia.getValor());

Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);
System.out.println(Genero.FEMININO);
        }
        }