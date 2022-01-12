package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String name;
    int base;
    int height;
    @Override
    public void getShapeName() {
        name="triangle";
    }

    @Override
    public int getField() {
        return base*height/2;
    }
}
