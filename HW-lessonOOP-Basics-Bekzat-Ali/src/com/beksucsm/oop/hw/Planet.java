package com.beksucsm.oop.hw;

public class Planet extends AstronomicalObject implements Orbital, WithEnvironment {

    public Planet(String name, int mass, double radius) {
        super(name, mass, radius);
    }

    @Override
    public double getFirstSpaceVelocity() {
        return Math.sqrt((GRAVITATIONAL_CONSTANT * getMass()) / getRadius());
    }

    @Override
    public boolean isOrbital() {
        System.out.println("The Planet moves in the orbit of a star");
        return true;
    }

    @Override
    public void getEnvironment() {
        solarSystemPlanetsCheck();
    }

    private void solarSystemPlanetsCheck() {
        switch (getName()) {
            case "Earth" -> System.out.println("Earth,just Earth ^_^");
            case "Mars" -> System.out.println("There is only a rock, can't get why Elon wants to colonize it");
            case "Mercury", "Venus" -> System.out.println("To close to the Sun,not much atmosphere");
            case "Jupiter", "Saturn", "Uranus", "Neptune" -> System.out.println("Gas giants");

            default ->
                    System.out.println("Not much information about this planet. But for sure,brother,you can't live there.");
        }
    }


    @Override
    public String toString() {
        return "Planet {" + getName() + "  " + getMass() + "  " + getRadius() + " }";
    }
}
