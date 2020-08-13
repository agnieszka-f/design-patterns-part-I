package factory.tasks;

public class PaintingTask implements Task{

    final String taskName;
    final String color;
    final String whatToPaint;
    boolean isExecute = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
