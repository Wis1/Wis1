package com.kodilla.sudoku;

public class StartGame {
    public static void main (String[]args){
        boolean gameFinished= false;

        while(!gameFinished){
            SudokuBoard sudokuBoard= new SudokuBoard();
            System.out.println(sudokuBoard);
            SudokuGame theGame= new SudokuGame();
            gameFinished= theGame.resolveSudoku();
        }
    }
}
