package com.kodilla.rps;

public class GameLogic {
    private String keyPlayer;
    private String moveComputer;
    private boolean wonPlayer;
    private boolean tie;

    public GameLogic(String keyPlayer, String moveComputer) {
        this.keyPlayer = keyPlayer;
        this.moveComputer = moveComputer;
    }

    public boolean isThereATie(){
        if (keyPlayer.equals(moveComputer))
            tie=true;
        else
            tie=false;
        return tie;
    }
    public boolean whetherThePlayerWon(){
        if(keyPlayer.equals("1") && moveComputer.equals("3"))
            wonPlayer=true;
        else if (keyPlayer.equals("2") && moveComputer.equals("1"))
            wonPlayer=true;
        else if (keyPlayer.equals("3") && moveComputer.equals("2"))
            wonPlayer=true;
        else
            wonPlayer=false;
        return wonPlayer;
    }
}
