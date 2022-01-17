package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
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
        BoardConfig boardConfig= context.getBean(BoardConfig.class);
        List<String> toDoList=boardConfig.list1().getTasks();
        List<String> doneList= boardConfig.list2().getTasks();
        List<String> inProgressList=boardConfig.list3().getTasks();

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
