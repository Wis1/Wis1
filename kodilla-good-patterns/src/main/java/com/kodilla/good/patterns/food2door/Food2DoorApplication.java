package com.kodilla.good.patterns.food2door;

import java.util.stream.Collectors;

public class Food2DoorApplication {
    public static void main(String[] args) throws IndexOutOfBoundsException{

                ExtraFoodShop extraFoodShop = new ExtraFoodShop();

                for(Product product: ListOfProducts.listOfProducts()){
                   try{ if (extraFoodShop.process(product)) {
                        System.out.println("Your order is complete \n"+product.getNameOfProduct()+": "+
                                product.getQuantity()+" "+
                                product.getUnit());
                    } else {
                        System.out.println("You must searching another shop");
                    }}catch (IndexOutOfBoundsException e){
                       System.out.println("Error "+ e);
                   };
        }
    }
}
