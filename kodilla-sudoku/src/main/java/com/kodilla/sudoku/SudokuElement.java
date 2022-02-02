package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {

    public static int EMPTY = -1;

    private int value;
    List<Integer>possibleValues=new ArrayList<>();

    public SudokuElement(int value) {
        if( value<0||value>10||value==EMPTY){
            throw new IllegalStateException("Element of Sudoku should be numbers 1 to 9 "+value);
        }else {
            this.value = value;
        }
    }

    public SudokuElement(List<Integer> possibleValues) {
        possibleValues.add(1);
        possibleValues.add(2);
        possibleValues.add(3);
        possibleValues.add(4);
        possibleValues.add(5);
        possibleValues.add(6);
        possibleValues.add(7);
        possibleValues.add(8);
        possibleValues.add(9);
        this.possibleValues = possibleValues;
    }

    public SudokuElement(){

    }

    public int getValue() {
        return this.value;
    }

    public List<Integer> getPossibleValues(){

        return possibleValues;
    }
    public List<Integer> getPossibleValuesWithoutNumbers (int number){
        getPossibleValues().remove(number-1);
        return getPossibleValues();
    }


}
