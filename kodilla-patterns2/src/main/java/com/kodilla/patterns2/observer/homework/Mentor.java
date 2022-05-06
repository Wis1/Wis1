package com.kodilla.patterns2.observer.homework;

public class Mentor implements Watcher {

    private final String name;
    int homeworks_amount;

    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(Student student) {
        System.out.println(student.getStudentName()+ " send homework: "+
                student.getHomeworks().poll().getName());
        homeworks_amount++;
    }
}
