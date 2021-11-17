package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String textToBeautify, PoemDecorator poemDecorator){
        String result=poemDecorator.decorate(textToBeautify);
        System.out.println("Result text beautifier is: "+ result);
    }
}
