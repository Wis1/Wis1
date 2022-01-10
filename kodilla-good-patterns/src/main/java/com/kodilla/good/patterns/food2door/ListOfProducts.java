package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class ListOfProducts {

    public static List<Product> listOfProducts() {


        Product product1 = new Product("apple", 300, "kilogram");
        Product product2 = new Product("banana", 100, "pieces");
        Product product3 = new Product("strawberry", 20, "kilograms");
        List<Product> listOfProducts= new ArrayList<>();
        listOfProducts.add(product1);
        listOfProducts.add(product2);
        listOfProducts.add(product3);
        return listOfProducts;
    }
}
