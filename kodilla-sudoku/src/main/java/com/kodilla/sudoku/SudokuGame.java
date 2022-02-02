package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {

    public boolean resolveSudoku(){
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Do you want play again?");
        System.out.println("Yes or no" );
        String answer= keyboard.nextLine();
        if (answer.equalsIgnoreCase("yes")){
            return true;
        }else if(answer.equalsIgnoreCase("no")){
            return false;
        }else{
            System.out.println("You must write: yes or no");
        }
        return false;
    }
}
