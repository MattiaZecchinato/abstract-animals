package org.lessons.java.animals;

public class Passerotto extends Animale {
    private String songType;
    private double wingSpan; // cm
    private double beakLength; // cm

    public Passerotto(String species, int age, String songType, double wingSpan, double beakLength) {
        super(species, age);
        this.songType = songType;
        this.wingSpan = wingSpan;
        this.beakLength = beakLength;
    }

    public String getSongType() {
        return this.songType;
    }

    public void setSongType(String songType) {
        this.songType = songType;
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
        System.out.println("Chip-chip");
    }

    @Override
    public void eat() {
        System.out.println("The bird eat seeds");
    }
}
