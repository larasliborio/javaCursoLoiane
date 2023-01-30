package com.loiane.cursojava.abc;

import com.loiane.cursojava.abc.Father;
import com.loiane.cursojava.abc.son;

public class test {
    public static void main(String[] args) {

        Father jon = new Father();
      
        
        son jony = new son();
        jony.name = "jony";
        jony.surName = "silva";
        jony.leg = 2;
        jony.arm = 2;
        System.out.println(jony.name);
        System.out.println(jony.surName);
        System.out.println(jony.arm);
        System.out.println(jony.leg);

    }
}
