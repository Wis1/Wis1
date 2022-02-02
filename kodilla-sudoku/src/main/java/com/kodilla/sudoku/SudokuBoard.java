package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    List<SudokuRow> board= new ArrayList<>();
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 8;
    private final SudokuElement[][] values = new SudokuElement[9][];

    public SudokuBoard() {
        for (int i=0; i <9; i++){
            values[i]= new SudokuElement[9];
        }
    }
    public SudokuElement getElement(int x, int y){
        return values[x][y];
    }
    public void setElement(SudokuElement value, int x, int y){
        values[x][y]=value;
    }

    public String toString() {
        String result = "";
        for (int y = MIN_INDEX; y <= MAX_INDEX; y++)
            result+=" _";
        result += "\n";
        for (int y = MIN_INDEX; y <= MAX_INDEX; y++) {
            result += "|";
            for (int x = MIN_INDEX; x <= MAX_INDEX; x++) {
                if (values[x][y] == null) {
                    result += "_";
                } else {
                    result+=values[x][y].getValue();
                }
                result += "|";
            }
            result += "\n";
        }
        return result;
    }
}
