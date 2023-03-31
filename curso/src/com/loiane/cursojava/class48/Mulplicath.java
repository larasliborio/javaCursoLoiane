package com.loiane.cursojava.class48;

import java.net.CacheRequest;

public class Mulplicath {
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
 }
}
}
