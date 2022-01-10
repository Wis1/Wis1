package com.kodilla.good.patterns.food2door;

import java.util.*;
import java.util.stream.Collectors;

public class ExtraFoodShop implements OrderProcessing{

    Provider extraFoodShop= new Provider("ExtraFoodShop", "387, London", 1652738);

    private Map<String, Integer> productsOfShop(){
        Map<String, Integer> productsOfShop = new HashMap<>();
        productsOfShop.put("apple", 500);
        productsOfShop.put("banana", 139);
        return productsOfShop;
    }

    @Override
    public boolean process(Product product) {
        List<Integer> value;
        value = productsOfShop().entrySet().stream()
                .filter(entry -> entry.getKey().contains(product.getNameOfProduct()))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        if(value.size()>0) {
            return product.getQuantity() <= value.get(0);
        }
        return false;
    }
}
