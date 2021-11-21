package com.kodilla.rps;

import java.util.Scanner;

public class Player {
    private String name;
    int numberOfRoundsWon;

    public Player(String name, int numberOfRoundsWon) {
        this.name = name;
        this.numberOfRoundsWon = numberOfRoundsWon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfRoundsWon() {
        return numberOfRoundsWon;
    }

    public void setNumberOfRoundsWon(int numberOfRoundsWon) {
        this.numberOfRoundsWon = numberOfRoundsWon;
    }
}
