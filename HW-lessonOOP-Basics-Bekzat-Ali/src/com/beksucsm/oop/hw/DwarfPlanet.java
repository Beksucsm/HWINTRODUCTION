package com.beksucsm.oop.hw;

public class DwarfPlanet extends Planet {

    public DwarfPlanet(String name, int mass, double radius) {
        super(name, mass, radius);
    }

    @Override
    public void getEnvironment() {
        System.out.println("Environment = Aliens");
    }

    @Override
    public String toString() {
        return "Dwarf Planet" + getName() + "  " + getMass() + "  " + getRadius() + " }";
    }
}
