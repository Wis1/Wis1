package com.kodilla.spring.portfolio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoardConfig {

    TaskList taskList1= new TaskList();
    TaskList taskList2= new TaskList();
    TaskList taskList3= new TaskList();

    @Autowired
    public Board setBoard() {
        return new Board(taskList1,taskList2, taskList3);
    }

}
