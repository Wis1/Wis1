package com.kodilla.testing.shape;

import static java.lang.Math.PI;

public class Circle implements Shape{

    String name;
    int radius;
    @Override
    public void getShapeName() {
        name="circle";
    }

    @Override
    public int getField() {
        return radius*radius* (int)PI;
    }
}
