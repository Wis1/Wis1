package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes= new ArrayList<>();

    public ShapeCollector() {
    }

    public void addFigure(Shape shape){
        shapes.add(shape);
    }
    public boolean removeFigure(Shape shape){
        boolean result= false;
        if(shapes.contains(shape)){
            shapes.remove(shape);
            result= true;
        }
        return result;
    }
    public Shape getFigure(int n){
        if (n>= 0&& n< shapes.size()){
            return shapes.get(n);
        }
        return null;
    }
    public List<Shape> showFigures(){

        return shapes;
    }
    public int getShapeQuantity(){
        return shapes.size();
    }

}
