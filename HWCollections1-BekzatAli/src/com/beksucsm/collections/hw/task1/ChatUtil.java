package com.beksucsm.collections.hw.task1;

import java.util.List;
import java.util.ListIterator;

public final class ChatUtil {

    private ChatUtil() {
    }

    public static void removeChats(List<Chat> list){
        //list.removeIf(nextChat -> nextChat.getUsersAmount() < 1000);
        ListIterator<Chat> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            Chat nextChat = listIterator.next();
            if(nextChat.getUsersAmount() < 1000){
                listIterator.remove();
            }
        }
    }
}
