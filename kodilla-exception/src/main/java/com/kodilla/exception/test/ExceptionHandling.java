package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[]args)throws Exception {
        SecondChallenge secondChallenge= new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2, 2);
        }
        catch (Exception e) {
            System.out.println("Found exception: "+e);
        }
        finally {
            System.out.println("It was attempt to execute a method.");
        }
    }
}
