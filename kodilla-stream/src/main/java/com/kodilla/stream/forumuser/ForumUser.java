package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int identifier;
    private final String nameOfUser;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPostsPublished;

    public ForumUser(int identifier, String nameOfUser, char sex, LocalDate dateOfBirth, int numberOfPostsPublished) {
        this.identifier = identifier;
        this.nameOfUser = nameOfUser;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPostsPublished = numberOfPostsPublished;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPostsPublished() {
        return numberOfPostsPublished;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identifier=" + identifier +
                ", nameOfUser='" + nameOfUser + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPostsPublished=" + numberOfPostsPublished +
                '}';
    }
}
