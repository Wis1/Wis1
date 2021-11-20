package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage (){
        //Given
        int[] numbers = new int[7];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
        numbers[4]=5;
        numbers[5]=6;
        numbers[6]=7;
        //When
        double averageResult=ArrayOperations.getAverage(numbers);
        //Then
        assertEquals(4.0, averageResult);
    }
    @Test
    void testGetAverage2(){
        //Given
        int[]numbers= new int[0];

        //When
        double averageResult=ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(0, averageResult);
    }
}
