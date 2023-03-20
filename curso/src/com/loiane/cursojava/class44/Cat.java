package com.loiane.cursojava.class44;


public class  Cat extends Mammal {

// public static final String System = " perce";
private String race;
public final String name;

public Cat(String name) {
    this.name = name;
}

public String getRace() {
    return race;
    }
    
    public void setRace(String race){
        this.race = "null";
    }

    @Override
    public void breastfeed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'breastfeed'");
    }

    @Override
    public void makeNoises() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeNoises'");
    }

















}