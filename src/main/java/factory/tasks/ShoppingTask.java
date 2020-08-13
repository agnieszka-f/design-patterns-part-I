package factory.tasks;

public class ShoppingTask implements Task{
    final String taskName;
    final String whatToBuy;
    final double quantity;
    boolean isExecute = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Wykonuję zadanie: " + taskName);
        isExecute = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecute;
    }
}
