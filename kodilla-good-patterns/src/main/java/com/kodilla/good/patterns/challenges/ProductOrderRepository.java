package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository {
    @Override
    public void createOrder(User user, String product, int quantity) {
        System.out.println("Order "+user.getUser()+" is succesful.");
        System.out.println("Ordered: "+quantity+" pcs of "+product);
    }
}
