package com.beksucsm.oop.hw;

public final class SpaceUtils {

    static final double GRAVITATIONAL_CONSTANT = 6.67;

    private SpaceUtils() {
    }

    public static double gravitationalForce(AstronomicalObject astronomicalObjects1, AstronomicalObject astronomicalObject2) {
        return GRAVITATIONAL_CONSTANT * astronomicalObjects1.getMass() * astronomicalObject2.getMass();
    }

    public static boolean isStar(AstronomicalObject astronomicalObject) {
        return astronomicalObject instanceof Star;
    }

}
