package com.beksucsm.collections.hw.task2;

import java.util.List;

public class ChatTwo {

    private String name;
    private List<User> users;

    public ChatTwo(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return users;
    }
}
