package com.kodilla.testing.collection;

import java.util.LinkedList;
import java.util.List;

public class OddNumberExterminator {

    public List<Integer> exterminate(List<Integer>numbers){
        List <Integer> evenNumbers= new LinkedList<>();
        for(int loop : numbers) {

            if (loop % 2 == 0)
                evenNumbers.add(loop);
        }
        return evenNumbers;

    }
}
