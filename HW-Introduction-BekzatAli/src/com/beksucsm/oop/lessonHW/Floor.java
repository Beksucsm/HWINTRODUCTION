package com.beksucsm.oop.lessonHW;

public class Floor {

    private int floor;
    private Apartment[] apartments;
    public Floor(int floor, Apartment[] apartments) {
        this.floor = floor;
        this.apartments = apartments;
    }

    public int getFloor() {
        return floor;
    }

    public Apartment[] getApartments() {
        return apartments;
    }


    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }

    public void print(){
        System.out.println("Floor " + floor + " has " + (apartments.length) + " apartments");
    }
}
