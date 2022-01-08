package com.kodilla.good.patterns.food2door;

public class Product {

    private String nameOfProduct;
    private int quantity;
    private String unit;

    public Product(String nameOfProduct, int quantity, String unit) {
        this.nameOfProduct = nameOfProduct;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }
}
