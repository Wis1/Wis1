package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board= context.getBean(Board.class);
        TaskList list=board.getToDoList();
        List<String> toDoList=board.getToDoList().getTasks();
        List<String> doneList= board.getDoneList().getTasks();
        List<String> inProgressList=board.getInProgressList().getTasks();

        List<String> toCheckList= new ArrayList<>();
        toCheckList.add("check");
        //When

        toDoList.add("check");
        doneList.add("check");
        inProgressList.add("check");

        //Then
        assertNotNull(list);
        assertEquals(toCheckList, toDoList);
        assertEquals(toCheckList, doneList);
        assertEquals(toCheckList, inProgressList);
    }
}
