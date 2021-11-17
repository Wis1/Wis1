package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor= new ExpressionExecutor();

        System.out.println("Calculating expression with lambdas.");
        expressionExecutor.executeExpression(10,5, (a,b)->a+b);
        expressionExecutor.executeExpression(10,5,(a, b)->a-b);
        expressionExecutor.executeExpression(10,5, (a, b)->a*b);
        expressionExecutor.executeExpression(10,5, (a, b)->a/b);

        System.out.println("Calculating expression with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByb);

        PoemBeautifier poemBeautifier= new PoemBeautifier();
        poemBeautifier.beautify("Programming",text -> text+":):)");
        poemBeautifier.beautify("Java", text -> "<)(> "+text+" <)(>");
        poemBeautifier.beautify("developer", text -> "**** "+ text+" ****");
        poemBeautifier.beautify("junior", text -> "::::{} "+text+" {}::::");
        poemBeautifier.beautify("example", text -> text.toUpperCase());
    }
}
