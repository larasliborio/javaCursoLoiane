package com.loiane.cursojava.aula41;

public class test {
    public static void main(String[] args) {
       // Person person = new Person();
       Person student = new student();
       Person rony = new teacher();

        //person.setAddress("streat 1, num 1");
        student.setAddress("streat 2,num 2");
        rony.setAddress("streat 3,num 3");

      //System.out.println(person.getAddress());
      System.out.println(student.getAddress());
      System.out.println(rony.getAddress());





    }
}