package com.beksucsm.oop.lessonHW;

public class Room {
    private boolean room;
    public Room(boolean room) {
        this.room = room;
    }

    public boolean isPassage() {
        return room;
    }

    public void setRoom(boolean room) {
        this.room = room;
    }

    public void print (){
        if (room) {
            System.out.println("Room is passable");
        }
        else System.out.println("Room is not passable");
    }
}
