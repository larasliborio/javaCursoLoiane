package com.loiane.cursojava.class47;

public class Etc {
    public static void main(String[] args) {
try{
     int[] vetor = new  int[4];
System.out.println("before the exeption ");
vetor [4] =1;
System.out.println("this text will no be impresed ");
    
} catch (ArrayIndexOutOfBoundsException Exception ) {
    System.out.println("don't found it");
}
System.out.println("this text will be impresed last of the exeption ");

    }

}