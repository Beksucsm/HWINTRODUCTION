package com.beksucsm.collections.hw.task2;

import java.util.List;

public class ChatsRunner {

    public static void main(String[] args) {

        List<User> userList1 = List.of(
                new User(1,"Brenda",19),
                new User(9,"Sanzhar",23),
                new User(24,"Bekzat-Ali",23),
                new User(11,"Yasper Moglot",17),
                new User(15,"Lena Golovach",14)
        );
        List<User> userList2 = List.of(
                new User(3,"Yasha Lava",27),
                new User(4,"Fiona",10),
                new User(5,"Shrek",17),
                new User(7,"Keks",28)
        );
        List<User> userList3 = List.of(
                new User(29,"Sasha",19),
                new User(34,"Masha",15),
                new User(31,"Dasha",80),
                new User(22,"Pasha",12)
        );
        List<ChatTwo> chatsList = List.of(
                new ChatTwo("Brenda",userList1),
                new ChatTwo("Shrekk",userList2),
                new ChatTwo("Russia",userList3)
        );

        List<User> adultUsers = ChatTwoUtil.convertToOneList(chatsList);
        System.out.println(adultUsers);
        System.out.println(ChatTwoUtil.averageAge(adultUsers));
    }
}
