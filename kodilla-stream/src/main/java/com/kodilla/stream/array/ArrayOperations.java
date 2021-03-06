package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[]numbers){
        if(numbers.length>0) {
            IntStream.range(0, numbers.length)
                    .map(n->numbers[n])
                    .forEach(System.out::println);
            double averageOfNumbers = IntStream.range(0, numbers.length)
                    .map(n->numbers[n])
                    .average()
                    .getAsDouble();
            return averageOfNumbers;
        }
        else{
            System.out.println("No elements");
            double mistake=0;
            return mistake;
        }
    }
}
