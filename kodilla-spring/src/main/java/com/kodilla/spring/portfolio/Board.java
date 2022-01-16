package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

@Component
public class Board {

    TaskList toDoList;
    TaskList doneList;
    TaskList inProgressList;


    public Board(TaskList toDoList, TaskList doneList, TaskList inProgressList) {
        this.toDoList = toDoList;
        this.doneList = doneList;
        this.inProgressList = inProgressList;
    }


}
