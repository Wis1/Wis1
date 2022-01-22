package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    String taskName;
    String color;
    String whatToPaint;
    boolean executed;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        if(whatToPaint.equals("")){
            executed=true;
            System.out.println("Painting task is executed.");
        }
        else {
            executed=false;
            System.out.println("Painting task is executing.");
        }
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
