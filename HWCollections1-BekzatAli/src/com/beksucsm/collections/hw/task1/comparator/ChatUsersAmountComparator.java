package com.beksucsm.collections.hw.task1.comparator;

import com.beksucsm.collections.hw.task1.Chat;

import java.util.Comparator;

public class ChatUsersAmountComparator implements Comparator<Chat> {

    @Override
    public int compare(Chat o1, Chat o2) {
        return Integer.compare(o2.getUsersAmount(), o1.getUsersAmount());
    }
}
