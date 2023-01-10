package com.loiane.cursojava.aula33;

public class testeMinhsCalculadora {
    
    public static void main(String[] args) {

minhaCalculadora calc = new minhaCalculadora();

calc.soma(1,2);
calc.soma(1.0, 2.0);
System.out.println("o resultado é :"+ calc.soma(1,2));
System.out.println("o resultado é :"+ calc.soma(1.0,2.0));
System.out.println("o resultado é :"+ calc.soma(1,2,3));




    }
}
