package com.loiane.cursojava.class44;


public class Dog extends Mammal{
    private int haight;
    private String race;
    public final String name;
    public Dog(String name) {
        this.name = name;
    }

    public int getHaight() {
        return haight;
        }
        
        public void setHaight(int haight){
            this.haight = haight;
        }

        public String getRace() {
            return race;
            }
            
            public void setRace(String race){
                this.race = race;
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
