package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Board {

    TaskList toDoList;
    TaskList doneList;
    TaskList inProgressList;
    private BoardConfig boardConfig;

    @Autowired
    public Board(BoardConfig boardConfig) {
        this.boardConfig = boardConfig;
    }

    public Board(TaskList toDoList, TaskList doneList, TaskList inProgressList) {
        this.toDoList = toDoList;
        this.doneList = doneList;
        this.inProgressList = inProgressList;
    }


}
