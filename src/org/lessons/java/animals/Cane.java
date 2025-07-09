package org.lessons.java.animals;

public class Cane extends Animale {
    private String name;
    private String colour;

    public Cane(String species, int age, String name, String colour) {
        super(species, age);
        this.name = name;
        this.colour = colour;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void sound() {
        System.out.println("Wof-wof");
    }

    @Override
    public void eat() {
        System.out.println("The dog eat dog kibble");
    }
}
