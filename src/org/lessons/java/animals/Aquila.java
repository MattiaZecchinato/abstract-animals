package org.lessons.java.animals;

import org.lessons.java.animals.inteface.Flyable;

public class Aquila extends AbstractAnimale implements Flyable {
    private double flightAltitude; // m
    private double wingSpan; // cm
    private double beakLength; // cm

    public Aquila(String species, int age, double flightAltitude, double wingSpan, double beakLength) {
        super(species, age);
        this.flightAltitude = flightAltitude;
        this.wingSpan = wingSpan;
        this.beakLength = beakLength;
    }

    public double getFlightAltitude() {
        return this.flightAltitude;
    }

    public void setFlightAltitude(double flightAltitude) {
        this.flightAltitude = flightAltitude;
    }

    public double getWingSpan() {
        return this.wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public double getBeakLenght() {
        return this.beakLength;
    }

    public void setBeakLenght(double beakLength) {
        this.beakLength = beakLength;
    }

    @Override
    public void sound() {
        System.out.println("Kiiiiii-eee");
    }

    @Override
    public void eat() {
        System.out.println("The eagle eat meat");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
