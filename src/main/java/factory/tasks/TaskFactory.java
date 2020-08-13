package factory.tasks;

public class TaskFactory {
    public Task createTask(TaskType taskType){
        switch(taskType){
            case DRIVING: return new DrivingTask("Driving Task", "Kraków", "Bike");
            case SHOPPING: return new ShoppingTask("Shopping Task","chees", 1.0);
            case PAINTING: return new PaintingTask("Painting Task","white","rose");
            default: return null;
        }
    }
}
