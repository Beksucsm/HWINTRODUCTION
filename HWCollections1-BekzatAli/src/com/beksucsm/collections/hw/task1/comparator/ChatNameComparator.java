package com.beksucsm.collections.hw.task1.comparator;

import com.beksucsm.collections.hw.task1.Chat;

import java.util.Comparator;

public class ChatNameComparator implements Comparator<Chat> {

    @Override
    public int compare(Chat o1, Chat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
