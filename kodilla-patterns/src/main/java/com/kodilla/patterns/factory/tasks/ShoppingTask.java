package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{

    String taskName;
    String whatToBuy;
    double quantity;
    boolean executed;

    public ShoppingTask(String taskName, String whatToBuy, double quantity, boolean executed) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.executed = executed;
    }

    @Override
    public void executeTask() {
        if(executed)
            System.out.println("Shopping task is executed.");
        else
            System.out.println("Shopping task is executing.");

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
