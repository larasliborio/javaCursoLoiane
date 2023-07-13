package com.loiane.cursojava.class48;

import com.loiane.cursojava.aula11.sequenciaScape;
import com.loiane.cursojava.classes.flor;

public class Testfinally {
      /**
     * @param args
     */
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        
        int [] numeros = {4, 8, 16, 32, 64, 128};
        int [] demon = {2,  0, 4, 8,0};
         for (int i= 0; i<numeros.length;i++){
            try {
            
              
            System.out.println(numeros[i]+ "/"+demon[i]+"="+(numeros[i]));
        }
         catch (ArithmeticException e) {
            System.out.println("erro a dividir por zero");   
         }
         catch ( ArrayIndexOutOfBoundsException e) {
            System.out.println("posição do Aray inválida");
        }   
        finally   {
            System.out.println("esta linnha é impressa sempre após do try ou catch"); 
        }
         }
        }
        }
        

