package com.kodilla.good.patterns.food2door;

public class Provider {

    private String companyName;
    private String address;
    private int numberOfProvider;

    public Provider(String companyName, String address, int numberOfProvider) {
        this.companyName = companyName;
        this.address = address;
        this.numberOfProvider = numberOfProvider;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfProvider() {
        return numberOfProvider;
    }
}
