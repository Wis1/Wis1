package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Test Suite: end");
    }

    @DisplayName(
            "When created OddNumbersExterminator with empty list, " +
                    "then  should return empty list"
    )
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> exampleNumbers= new LinkedList<>();
        OddNumberExterminator numbers= new OddNumberExterminator();
        List<Integer> emptyList;
        //When
        emptyList=numbers.exterminate(exampleNumbers);
        System.out.println("Testing: empty list");
        //Then
        Assertions.assertEquals(exampleNumbers,emptyList);


    }

    @DisplayName(
            "When created OddNumbersExterminator with normal list, " +
                    "then  should return list with only even numbers"
    )
    @Test
    void testOddNumbersExterminatorNormalList(){

        //Given
        List<Integer> exampleNumbers= new LinkedList<>();
        exampleNumbers.add(123);
        exampleNumbers.add(124);
        exampleNumbers.add(125);
        exampleNumbers.add(128);
        exampleNumbers.add(130);
        OddNumberExterminator numbers= new OddNumberExterminator();
        //When
        List<Integer> evenNumbersList= new LinkedList<>();
        evenNumbersList.add(124);
        evenNumbersList.add(128);
        evenNumbersList.add(130);
        numbers.exterminate(exampleNumbers);
        System.out.println("Testing: normal list");
        //Then
        Assertions.assertEquals(evenNumbersList,numbers.exterminate(exampleNumbers));


    }
}
