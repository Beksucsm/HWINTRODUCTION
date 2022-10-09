package com.beksucsm.oop.lessonHW;

public class BuildingInformation {
    public static void main(String[] args) {
        //Compositions+
         Room[] rooms = new Room[] {new Room(true),new Room(false),new Room(false),new Room(true)};

        Apartment apartment1 = new Apartment(1,rooms);
        Apartment apartment2 = new Apartment(2,rooms);
        Apartment apartment3 = new Apartment(3,rooms);
        Apartment apartment4 = new Apartment(4,rooms);
        Apartment[] apartments = new Apartment[] {apartment1,apartment2,apartment3,apartment4};

        Floor floor1 = new Floor(1, apartments);
        Floor floor2 = new Floor(2, apartments);
        Floor floor3 = new Floor(3, apartments);
        Floor floor4 = new Floor(4, apartments);


        Floor[] floors = new Floor[] {floor1, floor2, floor3, floor4};

        Building building = new Building(7, floors);

        printAllInformation(building);
    }

    public static void printAllInformation(Building building){
        building.print();
        for (Floor floor : building.getFloors() ) {
            floor.print();
            for (Apartment apartment : floor.getApartments()) {
                apartment.print();
                for (Room room : apartment.getRooms()){
                    room.print();
                }
            }
        }
    }
}
