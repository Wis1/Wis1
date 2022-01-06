package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {
        User user = new User("Pablo", "Coehne");
        String product="pen";
        int quantity= 100;

        OrderRequest orderRequest= new OrderRequest(user, product,quantity);
        OrderProcessor productProcessor= new OrderProcessor(
                new MailService(), new ProductOrderService(), new ProductOrderRepository());
        productProcessor.process(orderRequest);
    }

}
