package com.kodilla.good.patterns.food2door;

public class Food2DoorApplication {
    public static void main(String[] args) {

                ExtraFoodShop extraFoodShop = new ExtraFoodShop();
                if (extraFoodShop.process(ListOfProducts.listOfProducts().get(0))) {
                    System.out.println("Your order is complete \n"+ListOfProducts.listOfProducts().get(0).getNameOfProduct()+": "+
                            ListOfProducts.listOfProducts().get(0).getQuantity()+" "+
                            ListOfProducts.listOfProducts().get(0).getUnit());
                } else {
                    System.out.println("You must searching another shop");
                }
        System.out.println();

                HealthyShop healthyShop = new HealthyShop();
                if (healthyShop.process(ListOfProducts.listOfProducts().get(1))) {
                    System.out.println("Your order is complete \n"+ListOfProducts.listOfProducts().get(1).getNameOfProduct()+": "+
                            ListOfProducts.listOfProducts().get(1).getQuantity()+" "+
                            ListOfProducts.listOfProducts().get(1).getUnit());
                } else {
                    System.out.println("You must searching another shop");
                }
    }
}
