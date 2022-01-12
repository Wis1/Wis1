package com.kodilla.testing.shape;

public class Square implements Shape {
    String name;
    int sideLength;
    @Override
    public void getShapeName() {
        name="square";
    }

    @Override
    public int getField() {

        return sideLength*sideLength;
    }
}
