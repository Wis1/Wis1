package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    String taskName;
    String where;
    String using;
    boolean executed;

    public DrivingTask(String taskName, String where, String using, boolean executed) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.executed= executed;
    }

    @Override
    public void executeTask() {
        if (executed)
            System.out.println("Driving task is executed.");
        else
            System.out.println("Driving task is executing");
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
