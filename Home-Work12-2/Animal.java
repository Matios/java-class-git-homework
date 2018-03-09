package com.Matios;

public abstract class Animal {


    public String getName() {
        return "Animal";
    }

    public String getSound() {
        return "Has voice";
    }
    public void OldFarmSong(){
        System.out.println(


                "Old MacDonald had a farm, E I E I O!\n" +
                "And on that farm he had a "+ getName() +", E I E I O!\n" +
                "With a "+ getSound() +", " + getSound() +" here, and a "
                + getSound() +", "+ getSound()   + " there,\n" +
                "Here a "+getSound()+", there a "+getSound()+", everywhere a "+getSound()+" "+getSound()+",\n" +
                "Old MacDonald had a farm, E I E I O!\n" );


    }
}
