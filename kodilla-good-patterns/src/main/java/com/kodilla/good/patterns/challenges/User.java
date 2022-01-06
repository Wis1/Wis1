package com.kodilla.good.patterns.challenges;

public class User {
    public String name;
    public String surname;

    public User(String name, String surname){
        this.name= name;
        this.surname= surname;
    }

    public String getUser() {
        return name+" "+surname;
    }
}
