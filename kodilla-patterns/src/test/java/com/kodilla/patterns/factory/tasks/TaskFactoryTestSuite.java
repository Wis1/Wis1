package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask(){
        //Given
        TaskFactory factory= new TaskFactory();
        //When
        Task shoppingTask=factory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("Market", shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted(4));
    }
    @Test
    void testFactoryPaintingTask(){
        //Given
        TaskFactory factory= new TaskFactory();
        //When
        Task paintingTask=factory.makeTask(TaskFactory.PAINTING);
        //Then
        assertEquals("Kitchen", paintingTask.getTaskName());
        assertFalse(paintingTask.isTaskExecuted(0));
    }
    @Test
    void testFactoryDrivingTask(){
        //Given
        TaskFactory factory= new TaskFactory();
        //When
        Task drivingTask=factory.makeTask(TaskFactory.DRIVING);
        //Then
        assertEquals("journey", drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted(3));
    }
}
