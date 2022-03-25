package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    void testBasicPizzaOrderGetCost(){
        //Given
        PizzaOrder thePizza= new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost= thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);

    }

    @Test
    void testBasicPizzaOrderGetDescription(){
        //Given
        PizzaOrder thePizza= new BasicPizzaOrder();
        //When
        String description= thePizza.getDescription();
        //Then
        assertEquals("Pizza", description);
    }

    @Test
    void testDoubleCheeseGetCost(){
        //Given
        PizzaOrder thePizza= new BasicPizzaOrder();
        thePizza= new DoubleCheeseDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(20), theCost);
    }

    @Test
    void testDoubleCheeseGetDescription(){
        //Given
        PizzaOrder thePizza= new BasicPizzaOrder();
        thePizza= new DoubleCheeseDecorator(thePizza);
        //When
        String description= thePizza.getDescription();
        //Then
        assertEquals("Pizza + double cheese", description);
    }

    @Test
    void testBakonColagetCost(){
        //Given
        PizzaOrder thePizza= new BasicPizzaOrder();
        thePizza= new BaconDecorator(thePizza);
        thePizza= new ColaDecorator(thePizza);
        //When
        BigDecimal theCost= thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(26), theCost);
    }
}
