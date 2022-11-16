package com.beksucsm.collections.hw.task1;

import com.beksucsm.collections.hw.task1.comparator.ChatNameComparator;
import com.beksucsm.collections.hw.task1.comparator.ChatUsersAmountComparator;

import java.util.ArrayList;
import java.util.List;

public class ChatRunner {

    public static void main(String[] args) {

        List<Chat> list = new ArrayList<>();
        list.add(new Chat("Brenda",6969));
        list.add(new Chat("Brenda1",55));
        list.add(new Chat("Brenda2",1001));
        list.add(new Chat("Brenda3",999));
        list.add(new Chat("Brenda4",1234));
        list.add(new Chat("Brenda5",1488));
        list.add(new Chat("Brenda6",333));
        list.add(new Chat("Brenda7",7440));
        list.add(new Chat("Brenda9",7440));
        list.add(new Chat("Brenda8",7440));

        ChatUtil.removeChats(list);
        System.out.println(list);

        list.sort(new ChatUsersAmountComparator().thenComparing(new ChatNameComparator()));
        System.out.println(list);
    }
}
