package com.Matios;

public class Main {

    public static void main(String[] args) {


        System.out.println(
                "Old MacDonald Had A Farm\n" +
                "Brought to you by Java!\n\n" );
        Animal[] animal =
        {
           new Cow(), new Dog(), new Cat(), new Horse(), new Duck()

        };
        for (int i =0; i < animal.length; i++)
        animal[i].OldFarmSong();
    }
}
