package com.kodilla.spring.portfolio;

public class Board {

    TaskList toDoList;
    TaskList doneList;
    TaskList inProgressList;

    public Board(TaskList toDoList){
        this.toDoList= toDoList;
    }
}
