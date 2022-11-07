package com.beksucsm.oop.hw;

public class Comet extends AstronomicalObject implements WithEnvironment, Orbital {

    public Comet(String name, int mass, double radius) {
        super(name, mass, radius);
    }

    @Override
    public void getEnvironment() {
        System.out.println("No atmosphere,has tale made of gaze and dust.That's only fact,I know about comets");
    }

    @Override
    public double getFirstSpaceVelocity() {
        return 0;
    }

    @Override
    public boolean isOrbital() {
        System.out.println("Conical trajectory");
        return true;
    }

    @Override
    public String toString() {
        return "Comet{" + getName() + "  " + getMass() + "  " + getRadius() + " }";
    }
}
