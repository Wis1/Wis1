package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    String name, key, computerKey;
    boolean whoWon, end=false;;
    int playersScore=0, computerScore=0;;
    int numbersOfRoundWon;
    Computer computer= new Computer();
    Scanner keyboard= new Scanner(System.in);
    Player player= new Player(name, numbersOfRoundWon);

    public void startGame() {

        System.out.println("Your name: ");
        name = keyboard.nextLine();
        player.setName(name);
        System.out.println("Write numbers of rounds won in your game ");
        numbersOfRoundWon = keyboard.nextInt();
        player.setNumberOfRoundsWon(numbersOfRoundWon);
        keyboard.nextLine();
        System.out.println("key 1 - rock");
        System.out.println("key 2 - paper");
        System.out.println("key 3 - scissors");
        System.out.println("key x - end game");
        System.out.println("key n - new game");
        System.out.println("Make a move!");
        playGame();
    }

    public void exitGame(){

        if (playersScore>0||computerScore>0)
            printResult();
        System.out.println("End the game. Goodbye!");
        System.exit(0);
    }

    public void playGame() {
            do {
                key = keyboard.nextLine();
                if (key.equals("x")){
                    end = true;
                    exitGame();}
                else if (key.equals("n"))
                    startGame();
                if(key.equals("1")||key.equals("2")||key.equals("3")){
                computerKey = computer.computerMove();
                System.out.println(computerKey);
                GameLogic gameLogic = new GameLogic(key, computerKey);

                if (!gameLogic.isThereATie()) {
                    whoWon = gameLogic.whetherThePlayerWon();
                    if (whoWon)
                        playersScore++;
                    else
                        computerScore++;
                } else
                    System.out.println("Tie, next round");

                System.out.println("Player's score= " + playersScore);
                System.out.println("Computer score= " + computerScore);

                if (playersScore == player.getNumberOfRoundsWon() || computerScore == player.getNumberOfRoundsWon())
                    end = true;}
                else
                    System.out.println("Use keys: 1,2,3,x or n.");

            } while (!end);
    }

    public void printResult(){
        System.out.println();
        System.out.println("End the game.");
        System.out.println("Player's "+player.getName()+" score= " + playersScore);
        System.out.println("Computer score= " + computerScore);

        if (playersScore>computerScore)
            System.out.println("Player "+player.getName()+" won!!!");
        else
            System.out.println("Computer won!!!");
    }
}
