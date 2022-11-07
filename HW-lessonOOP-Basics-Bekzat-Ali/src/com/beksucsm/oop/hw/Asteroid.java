package com.beksucsm.oop.hw;

public class Asteroid extends AstronomicalObject implements WithEnvironment, Formless {

    public Asteroid(String name, int mass, double radius) {
        super(name, mass, radius);
    }

    @Override
    public void getEnvironment() {
        System.out.println("There is not atmosphere in Asteroids,dude...");
    }

    @Override
    public boolean isSphere() {
        return false;
    }

    @Override
    public String toString() {
        return "Asteroid{" + getName() + "  " + getMass() + "  " + getRadius() + " }";
    }
}
