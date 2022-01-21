package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    String taskName;
    String color;
    String whatToPaint;
    boolean executed;

    public PaintingTask(String taskName, String color, String whatToPaint, boolean executed) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.executed= executed;
    }

    @Override
    public void executeTask() {
        if(executed)
            System.out.println("Painting task is executed.");
        else
            System.out.println("Painting task is executing.");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }
}
