package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskShape) {
        switch (taskShape) {
            case SHOPPING:
                return new ShoppingTask("Market", "Milk, butter", 28, true);
            case PAINTING:
                return new PaintingTask("Kitchen", "white", "all", false);
            case DRIVING:
                return new DrivingTask("journey", "Wroclaw", "bus", true);
            default:
                return null;
        }

    }
}
