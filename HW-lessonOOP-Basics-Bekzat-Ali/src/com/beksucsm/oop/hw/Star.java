package com.beksucsm.oop.hw;

import static java.lang.Math.PI;

public class Star extends AstronomicalObject implements Luminous, WithEnvironment {

    private final double luminosity;

    public Star(String name, int mass, double radius, double luminosity) {
        super(name, mass, radius);
        this.luminosity = luminosity;
    }

    @Override
    public double getEffectiveTemperature() {
        double denominator = 4 * PI * Math.pow(getRadius(), 2.0);
        return luminosity / denominator;
    }

    @Override
    public void getEnvironment() {
        System.out.println("Gas and Plasma");
    }

    @Override
    public String toString() {
        return "Star {" + getName() + "  " + getMass() + "  " + getRadius() + " " + getLuminosity() + " }";
    }

    public double getLuminosity() {
        return luminosity;
    }
}
