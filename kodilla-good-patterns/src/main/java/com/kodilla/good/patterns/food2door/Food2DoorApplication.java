package com.kodilla.good.patterns.food2door;

import java.util.Scanner;

public class Food2DoorApplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Write product which you want order.");
        String order = keyboard.nextLine();
        System.out.println("Write quantity, which you need.");
        int quantity = keyboard.nextInt();
        System.out.println("Write unit.");
        String unit = keyboard.nextLine();
        keyboard.nextLine();
        System.out.println("Choice shop (choice 1 or 2)");
        System.out.println("1. ExtraFoodShop");
        System.out.println("2. HealthyShop");
        int numberOfShop = keyboard.nextInt();
        switch (numberOfShop) {
            case 1: {
                ExtraFoodShop extraFoodShop = new ExtraFoodShop();
                if (extraFoodShop.process(order, quantity, unit)) {
                    System.out.println("Your order is complete");
                } else {
                    System.out.println("You must searching another shop");
                }
                break;
            }
            case 2: {
                HealthyShop healthyShop = new HealthyShop();
                if (healthyShop.process(order, quantity, unit)) {
                    System.out.println("Your order is complete");
                } else {
                    System.out.println("You must searching another shop");
                }
                break;
            }
            default: {
                System.out.println("default");
            }


        }
    }
}
