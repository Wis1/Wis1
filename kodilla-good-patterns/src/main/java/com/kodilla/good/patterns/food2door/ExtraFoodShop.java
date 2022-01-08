package com.kodilla.good.patterns.food2door;

import java.util.*;
import java.util.stream.Collectors;

public class ExtraFoodShop implements OrderProcessing{

    Provider extraFoodShop= new Provider("ExtraFoodShop", "387, London", 1652738);

    private Map<String, Integer> productsOfShop(){
        Map<String, Integer> productsOfShop = new HashMap<>();
        productsOfShop.put("apple", 500);
        return productsOfShop;
    }
    
    
    @Override
    public boolean process(String nameOfProduct, int quantity, String unit) {
        List<Integer> value;
        value = productsOfShop().entrySet().stream()
                .filter(entry -> entry.getKey().equals(nameOfProduct))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        return quantity <= value.get(0);

    }
}
