package com.beksucsm.collections.hw.task2;

import com.beksucsm.collections.hw.task1.Chat;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public final class ChatTwoUtil {

    private ChatTwoUtil(){
    }

    //IJ idea предложила через for.
    public static List<User> convertToOneList(List<ChatTwo> list){
        List<User> resultUsersList = new ArrayList<>();
        ListIterator<ChatTwo> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            ChatTwo nextChat = listIterator.next();
            ListIterator<User> userListIterator = nextChat.getUsers().listIterator();
            while(userListIterator.hasNext()){
                User nextUsers = userListIterator.next();
                if(nextUsers.getAge() >= 18){
                    resultUsersList.add(nextUsers);
                }
            }
        }
        return resultUsersList;
    }

    public static int averageAge(List<User> list){
        int sum = 0;
        for (User user : list) {
            sum += user.getAge();
        }
        return sum/list.size();
    }
}
