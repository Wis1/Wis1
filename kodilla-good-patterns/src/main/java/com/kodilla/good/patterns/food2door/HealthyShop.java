package com.kodilla.good.patterns.food2door;

import java.util.LinkedList;
import java.util.List;

public class HealthyShop implements OrderProcessing{

    @Override
    public boolean process(Product product) {
        List<String> fruit= new LinkedList<>();
        fruit.add("apple");
        fruit.add("banana");

        return fruit.contains(product.getNameOfProduct());
    }
}
