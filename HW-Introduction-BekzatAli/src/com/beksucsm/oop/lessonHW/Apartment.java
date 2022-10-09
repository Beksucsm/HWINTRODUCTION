package com.beksucsm.oop.lessonHW;

public class Apartment {

    private int apartment;
    private Room[] rooms;

    public Apartment(int apartment, Room[] rooms) {
        this.apartment = apartment;
        this.rooms = rooms;
    }

    public int getApartment() {
        return apartment;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public void print(){
        System.out.println("Apartment " + apartment + " has " + (rooms.length) + " rooms");
    }

}
