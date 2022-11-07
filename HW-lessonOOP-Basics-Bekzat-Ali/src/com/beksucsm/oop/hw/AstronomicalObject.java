package com.beksucsm.oop.hw;

public abstract class AstronomicalObject {

    private final String name;
    private final int mass;
    private final double radius;

    public AstronomicalObject(String name, int mass, double radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public boolean isMassesEqual(AstronomicalObject astronomicalObject) {
        return getMass() == astronomicalObject.getMass();
    }

    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
}
