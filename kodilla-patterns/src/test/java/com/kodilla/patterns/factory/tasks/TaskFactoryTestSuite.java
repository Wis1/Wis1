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
        shoppingTask.executeTask();
        //Then
        assertEquals("Market", shoppingTask.getTaskName());
        assertFalse(shoppingTask.isTaskExecuted());
    }
    @Test
    void testFactoryPaintingTask(){
        //Given
        TaskFactory factory= new TaskFactory();
        //When
        Task paintingTask=factory.makeTask(TaskFactory.PAINTING);
        paintingTask.executeTask();
        //Then
        assertEquals("Kitchen", paintingTask.getTaskName());
        assertFalse(paintingTask.isTaskExecuted());
    }
    @Test
    void testFactoryDrivingTask(){
        //Given
        TaskFactory factory= new TaskFactory();
        //When
        Task drivingTask=factory.makeTask(TaskFactory.DRIVING);
        drivingTask.executeTask();
        //Then
        assertEquals("journey", drivingTask.getTaskName());
        assertFalse(drivingTask.isTaskExecuted());
    }
}
