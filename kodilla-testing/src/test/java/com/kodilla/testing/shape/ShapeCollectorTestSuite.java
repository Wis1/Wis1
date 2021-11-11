package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    private static int testCounter= 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("This is beginning of tests.");
    }
    @AfterAll
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #"+ testCounter);
    }

    @Nested
    @DisplayName("Tests for squares")
    class TestSquare {
        @Test
        public void testAddFigure(){

            //Given
            ShapeCollector shapeCollector= new ShapeCollector();

            //When
            shapeCollector.addFigure(new Square());

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapeQuantity());

        }
        @Test
        public void testRemoveFigure(){

            //Given
            ShapeCollector shapeCollector= new ShapeCollector();
            Shape shape= new Square();
            shapeCollector.addFigure(shape);

            //When
            boolean result= shapeCollector.removeFigure(shape);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getShapeQuantity());
        }
        @Test
        public void testGetFigure(){

            //Given
            ShapeCollector shapeCollector= new ShapeCollector();
            Shape shape= new Square();
            shapeCollector.addFigure(shape);

            //When
            Shape retrievedShape;
            retrievedShape=shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(shape,retrievedShape);
        }
        @Test
        public void testShowFigures(){

            //Given
            ShapeCollector shapeCollector= new ShapeCollector();
            Shape shape1= new Square();
            Shape shape2= new Circle();
            Shape shape3= new Triangle();
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            shapeCollector.addFigure(shape3);

            //When
            List<Shape> retrivedCollector= new ArrayList<>();
            retrivedCollector.add(shape1);
            retrivedCollector.add(shape2);
            retrivedCollector.add(shape3);

            //Then
            Assertions.assertEquals(retrivedCollector,shapeCollector.showFigures());
        }

        @Test
        public void TestGetFigureNegativeIndex(){

            //Given
            ShapeCollector shapeCollector= new ShapeCollector();
            Shape shape= new Square();
            shapeCollector.addFigure(shape);

            //When
            Shape retrievedShape;
            retrievedShape=shapeCollector.getFigure(-1);

            //Then
            Assertions.assertNull(retrievedShape);
        }
        @Test
        public void TestGetFigureIndexOutsideTheListSize(){

            //Given
            ShapeCollector shapeCollector= new ShapeCollector();
            Shape shape= new Square();
            shapeCollector.addFigure(shape);

            //When
            Shape retrievedShape;
            retrievedShape=shapeCollector.getFigure(1);

            //Then
            Assertions.assertNull(retrievedShape);
        }
    }
}
