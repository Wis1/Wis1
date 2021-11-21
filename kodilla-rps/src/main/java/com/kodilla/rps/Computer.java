package com.kodilla.rps;

import java.util.Random;

public class Computer {
    String rpsString;
    int rpsInt;

    public String getRpsString() {
        return rpsString;
    }

    Random generator = new Random();
    public String computerMove() {
        rpsInt = generator.nextInt(2) + 1;
        if (rpsInt == 1)
            rpsString = "1";
        else if (rpsInt == 2)
            rpsString = "2";
        else if (rpsInt == 3)
            rpsString = "3";
        return rpsString;
    }
}
