package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{

    String taskName;
    String whatToBuy;
    double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Shopping task is executing.");
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted(int execute) {
        boolean executed;
        if(execute==0)
            executed=false;
        else
            executed=true;
        return executed;
    }
}
