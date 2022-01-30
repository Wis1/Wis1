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

    public String toString() {
        String result = "";
        for (int y = MIN_INDEX; y <= MAX_INDEX; y++) {
            result += "|";
            for (int x = MIN_INDEX; x <= MAX_INDEX; x++) {
                if (values[x][y] == null) {
                    result += "  ";
                } else {
                    System.out.println("cokolwiek");
                }
                result += "|";
            }
            result += "\n";
        }
        return result;
    }
}
