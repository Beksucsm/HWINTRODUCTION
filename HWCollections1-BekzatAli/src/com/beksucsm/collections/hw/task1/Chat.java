package com.beksucsm.collections.hw.task1;

public class Chat {

    private final String name;
    private int usersAmount;

    public Chat(String name, int usersAmount) {
        this.name = name;
        this.usersAmount = usersAmount;
    }

    public String getName() {
        return name;
    }

    public int getUsersAmount() {
        return usersAmount;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", usersAmount=" + usersAmount +
                '}';
    }
}
