package com.loiane.cursojava.aula18;

import java.util.Scanner;

import javax.sound.midi.Sequencer.SyncMode;

public class breakEContinue {
    public static void main(String[] args) {

        /*
         * Scanner scan = new Scanner(System.in);
         * 
         * System.out.println("entre com um numero");
         * int num = scan.nextInt();
         * 
         * System.out.println("entre com um numero limite");
         * int max = scan.nextInt();
         * 
         * for (int i = num; i <= max; i++) {
         * System.out.println(i);
         * 
         * if (i % 7 == 0) {
         * 
         * System.out.println("'o valor de i é :" + i);
         * break;
         * }
         * }
         */
        for (int i = 0; i <= 4; i++) {

            rotulo1: {
                rotulo2: {
                    rotulo3: {
                        if (i == 1) {
                            break rotulo1;
                        }
                        if (i == 2) {
                            break rotulo2;
                        }
                        if (i == 3) {
                            break rotulo3;
                        }
                        System.out.println("ROTULO 3");
                    }
                    System.out.println("ROTULO 2");
                }
                System.out.println("ROTULO 1");    
            }
            System.out.println( i);
        }
    }
}
