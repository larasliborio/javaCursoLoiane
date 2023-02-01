package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class SwishCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("entre com um dia da semana de (1-7) ");

        int diaSemana = scan.nextInt();

        /*if (diaSemana == 1) {
            System.out.println("DOMINGO");
        } else if (diaSemana == 2) {
            System.out.println("SEGUNDA-FEIRA");
        } else if (diaSemana == 3) {
            System.out.println("TERÇA-FEIRA");
        } else if (diaSemana == 4) {
            System.out.println("QUARTA-FEIRA");
        } else if (diaSemana == 5) {
            System.out.println("QUINTA-FEIRA");
        } else if (diaSemana == 6) {
            System.out.println("SEXTA-FEIRA");
        } else if (diaSemana == 7) {
            System.out.println("SÁBADO");
        } else {
            System.out.println("NÃO É UM DIA DA SEMANA VALIDO");*/

            switch (diaSemana) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("dia util");
                    break;
                case 7:
                    System.out.println("sábado");
                    break;
                default:
                    System.out.println("NÃO É UM DIA DA SEMANA VALIDO");

            }
        }
    }

