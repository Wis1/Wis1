package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main (String[]args){
        SimpleUser simpleUser= new SimpleUser("theForumUser");

        String result= simpleUser.getUserName();

        if (result.equals("theForumUser"))
            System.out.println("Test ok");
        else
            System.out.println("Error!");

        Calculator calculator= new Calculator();

        int resultOfAdd= calculator.add(123,24);

        if (resultOfAdd==147)
            System.out.println("Test calculator.add ok");
        else
            System.out.println("calculator.add Error!");

        int resultOfSubtract= calculator.subtract(123,24);

        if (resultOfSubtract==99)
            System.out.println("Test calculator.subtract ok");
        else
            System.out.println("calculator.subtract error!");
    }
}
