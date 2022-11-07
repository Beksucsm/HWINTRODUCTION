package com.beksucsm.oop.hw;

public class NaturalSatellite extends AstronomicalObject implements Periodic {

    private final int distanceToAstronomicalObject;

    public NaturalSatellite(String name, int mass, double radius, int distanceToAstronomicalObject) {
        super(name, mass, radius);
        this.distanceToAstronomicalObject = distanceToAstronomicalObject;
    }

    public int getDistanceToAstronomicalObject() {
        return distanceToAstronomicalObject;
    }

    //Я тут написал от балды,не нашёл формулу для вывода периода вращения спутника вокруг тела.
    @Override
    public int getRotationPeriod() {
        return distanceToAstronomicalObject * getMass();
    }

    @Override
    public String toString() {
        return "Satellite {" + getName() + "  " + getMass() + "  " + getRadius() + " " + getDistanceToAstronomicalObject() + " }";
    }
}
