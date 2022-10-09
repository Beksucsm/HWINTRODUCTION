package com.beksucsm.oop.lessonHW;

public class Building {

    private int building;
    private Floor[] floors;
    public Building(int building, Floor[] floors) {
        this.building = building;
        this.floors = floors;
    }

    public int getBuilding() {
        return building;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void print(){
        System.out.println("Building " + building  + " has " + floors.length + " floors.");
    }

}
