package org.lessons.java.animals;

import org.lessons.java.animals.inteface.Swimmable;

public class Delfino extends AbstractAnimale implements Swimmable {
    private int groupSize;
    private double swimSpeed; // kph

    public Delfino(String species, int age, int groupSize, double swimSpeed) {
        super(species, age);
        this.groupSize = groupSize;
        this.swimSpeed = swimSpeed;
    }

    public int getGroupSize() {
        return this.groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

    public double getSwimSpeed() {
        return this.swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void sound() {
        System.out.println("Whee-whee");
    }

    @Override
    public void eat() {
        System.out.println("The dolphine eat fish");
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }
}
