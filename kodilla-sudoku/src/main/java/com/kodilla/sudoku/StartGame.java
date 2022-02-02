package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartGame {
    public static void main (String[]args){
        boolean gameFinished= false;
        List<Integer> numberOnBoard= new ArrayList<>(3);
        Scanner keyboard= new Scanner(System.in);

        while(!gameFinished){
            SudokuBoard sudokuBoard= new SudokuBoard();
            System.out.println(sudokuBoard);
            SudokuGame theGame= new SudokuGame();

            gameFinished= theGame.resolveSudoku();
            System.out.println("Write a number in the field");
            String numberString= keyboard.nextLine();
            int numberOfColumn= (int)numberString.charAt(0)-48;
            int numberOfRow= (int)numberString.charAt(2)-48;
            int number= (int)numberString.charAt(4)-48;
            SudokuElement element= new SudokuElement(number);
            numberOnBoard.add(numberOfColumn);
            numberOnBoard.add(numberOfRow);
            numberOnBoard.add(number);
            sudokuBoard.setElement(element,numberOfColumn,numberOfRow);
        }
    }
}
