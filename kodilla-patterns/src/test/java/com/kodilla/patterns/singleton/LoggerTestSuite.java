package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testGetLastLog(){

        //Given
        logger=Logger.LOG;
        //When
        logger.log("Black13");
        //Then
        assertEquals("Black13", logger.getLastLog());

    }
}
