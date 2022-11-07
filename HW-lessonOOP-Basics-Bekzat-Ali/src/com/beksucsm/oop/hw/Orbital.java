package com.beksucsm.oop.hw;


public interface Orbital {

    static final double GRAVITATIONAL_CONSTANT = 6.67;

    double getFirstSpaceVelocity();

    default double getSecondSpaceVelocity() {
        return getFirstSpaceVelocity() * Math.sqrt(2.0);
    }

    boolean isOrbital();
}
