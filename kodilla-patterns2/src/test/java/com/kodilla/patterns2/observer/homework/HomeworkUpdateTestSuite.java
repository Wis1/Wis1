package com.kodilla.patterns2.observer.homework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkUpdateTestSuite {

    @Test
    void testUpdate(){

        //Given
        Homework homework1= new Homework("Collections");
        Homework homework2= new Homework("Loops");
        Homework homework3= new Homework("Interfaces");

        Student student1= new Student("Paul");
        Student student2= new Student("Bob");

        Mentor mentor1= new Mentor("Chris");
        Mentor mentor2= new Mentor("Jack");


        student1.registerWatcher(mentor1);
        student2.registerWatcher(mentor2);

        //When
        student1.addHomework(homework1);
        student1.addHomework(homework2);
        student2.addHomework(homework1);
        student2.addHomework(homework2);
        student2.addHomework(homework3);

        //Then
        assertEquals(2,mentor1.homeworks_amount);
        assertEquals(3, mentor2.homeworks_amount);

    }
}
