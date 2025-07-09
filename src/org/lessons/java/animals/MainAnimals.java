package org.lessons.java.animals;

import org.lessons.java.animals.inteface.Flyable;
import org.lessons.java.animals.inteface.Swimmable;

public class MainAnimals {
    public static void main(String[] args) {
        Cane goldenRetriever = new Cane("Golden Retriever", 5, "Ellie", "gold");

        goldenRetriever.sound();
        goldenRetriever.eat();
        System.out.println(goldenRetriever.getSpecies());

        System.out.println("----------------------");

        Passerotto passeroDomestico = new Passerotto("Passero domestico", 2, "chirrup", 6.5d, 1.1d);

        passeroDomestico.sound();
        passeroDomestico.eat();
        System.out.println(passeroDomestico.getSongType());
        makeFly(passeroDomestico);

        System.out.println("----------------------");

        Aquila aquilaReale = new Aquila("Aquila Reale", 13, 2500d, 190d, 6d);

        aquilaReale.sound();
        aquilaReale.eat();
        System.out.println(
                aquilaReale.getSpecies() + " flies at an altitude of " + aquilaReale.getFlightAltitude() + "m");
        makeFly(aquilaReale);

        System.out.println("----------------------");

        Delfino delfinoComune = new Delfino("Delfino Comune", 15, 25, 35d);

        delfinoComune.sound();
        delfinoComune.eat();
        System.out.println(delfinoComune.getSpecies() + " swims at " + delfinoComune.getSwimSpeed() + " kph");
        makeSmiw(delfinoComune);
    }

    /**
     * Invokes the fly behavior on any object that implements the Flyable interface.
     * 
     * @param animal an object that can fly (implements Flyable)
     */
    static void makeFly(Flyable animal) {
        animal.fly();
    }

    /**
     * Invokes the swim behavior on any object that implements the Swimmable
     * interface.
     * 
     * @param animal an object that can swim (implements Swimmable)
     */
    static void makeSmiw(Swimmable animal) {
        animal.swim();
    }
}
