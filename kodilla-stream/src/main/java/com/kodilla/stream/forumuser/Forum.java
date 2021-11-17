package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private List<ForumUser> userList=new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(1, "John", 'M', (LocalDate.of(2000,06,10)),1000));
        userList.add(new ForumUser(2,"Mike", 'M', (LocalDate.of(1995, 12,03)),500 ));
        userList.add(new ForumUser(3,"Caroline",'F', (LocalDate.of(1978,10,17)), 0));
        userList.add(new ForumUser(4,"Katia", 'F', LocalDate.of(2001,10,3), 150));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }

}
