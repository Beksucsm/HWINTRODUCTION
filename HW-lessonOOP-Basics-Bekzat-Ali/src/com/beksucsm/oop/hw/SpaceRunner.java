package com.beksucsm.oop.hw;

public class SpaceRunner {
    public static void main(String[] args) {
        Star star = new Star("Sun", 1000, 2000, 100);
        Planet planet1 = new Planet("Earth", 100, 640);
        Planet planet2 = new Planet("Mars", 50, 500);
        Asteroid asteroid = new Asteroid("Untitled", 5, 50);
        Comet comet = new Comet("Unnamed comet", 3, 30);
        NaturalSatellite naturalSatellite = new NaturalSatellite("Moon", 20, 100, 300);
        DwarfPlanet dwarfPlanet = new DwarfPlanet("Pluto", 10, 10);

        System.out.println(star.getEffectiveTemperature());
        star.getEnvironment();
        System.out.println(planet1.getFirstSpaceVelocity());
        planet2.getEnvironment();
        asteroid.getEnvironment();
        System.out.println(asteroid.isSphere());
        comet.isOrbital();
        System.out.println(naturalSatellite.getRotationPeriod());
        dwarfPlanet.getEnvironment();
        System.out.println(SpaceUtils.gravitationalForce(planet1, planet2));
        System.out.println(star.getDiameter());

        System.out.println(asteroid.toString());
    }
}
