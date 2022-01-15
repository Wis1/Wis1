package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class BoardTestSuite {

    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board= context.getBean(Board.class);
        List<String> toDoList= board.toDoList.getTasks();
        List<String> doneList= board.doneList.getTasks();
        List<String> inProgressList= board.inProgressList.getTasks();

        List<String> toCheckList= new ArrayList<>();
        toCheckList.add("check");
        //When

        toDoList.add("check");
        doneList.add("check");
        inProgressList.add("check");

        //Then
        assertEquals(toCheckList, toDoList);
        assertEquals(toCheckList, doneList);
        assertEquals(toCheckList, inProgressList);
    }
}
