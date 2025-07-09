package org.lessons.java.animals;

public abstract class Animale {
    protected String species;
    protected int age;

    public Animale(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sleep() {
        System.out.println("Zzzzzz");
    }

    public abstract void sound();

    public abstract void eat();
}
