package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        double divideResult=a/b;
        try {  if (b == 0) {
            throw new ArithmeticException();
        }   return divideResult;
        } catch (ArithmeticException e) {
            System.out.println("You can't divide for zero. Error: " + e);
        } finally {
            System.out.println("An attempt was made to divide");
        }
        return divideResult;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);

        System.out.println(result);
    }

}