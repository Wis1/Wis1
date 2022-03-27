package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Student  implements Visible{
    private final String studentName;
    private final Deque<Homework> homeworks;
    private final List<Watcher> watchers;



    public Student(String studentName) {
        watchers= new ArrayList<>();
        homeworks= new ArrayDeque<>();
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void addHomework (Homework homework){
        homeworks.offer(homework);
        notifyWatcher();
    }

    public Deque<Homework> getHomeworks() {
        return homeworks;
    }

    public List<Watcher> getWatchers() {
        return watchers;
    }

    @Override
    public void registerWatcher(Watcher watcher) {
        watchers.add(watcher);

    }

    @Override
    public void notifyWatcher() {
        for (Watcher watcher: watchers){
            watcher.update(this);
        }
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        watchers.remove(watcher);
    }
}
