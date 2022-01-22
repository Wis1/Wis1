package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{

    String taskName;
    String whatToBuy;
    double quantity;
    boolean executed;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        if(quantity==0) {
            executed = true;
            System.out.println("Shopping task is executed.");
        }
        else {
            executed = false;
            System.out.println("Shopping task is executing.");
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
