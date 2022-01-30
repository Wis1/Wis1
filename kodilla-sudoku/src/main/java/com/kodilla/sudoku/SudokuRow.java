package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    List<SudokuElement> row= new ArrayList<>();

    public SudokuRow(List<SudokuElement> row) {
        for(int i=0;i<9;i++) {
            row.add(new SudokuElement());
        }
        this.row = row;
    }
}
