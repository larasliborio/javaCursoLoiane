package com.loiane.cursojava.aula34;

public class testeMinhaCalculadora {

static int resultsoma;

    public static void main(String[] args) {

      //  MinhaCalculadora calc = new MinhaCalculadora();
        
        //calc.soma(1,2);
        MinhaCalculadora.soma(1, 2, 0);
        
        resultsoma = MinhaCalculadora.soma(1, 2, 0);


        soma2valores(1,2);
    }

     static int soma2valores(int num1,int num2){
        return  MinhaCalculadora.soma(1, 2, 0);
    }
}
