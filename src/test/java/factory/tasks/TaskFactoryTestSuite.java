package factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void test1(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task task1 = taskFactory.createTask(TaskType.DRIVING);
        Task task2 = taskFactory.createTask(TaskType.SHOPPING);
        Task task3 = taskFactory.createTask(TaskType.PAINTING);
        task2.executeTask();
        //Then
        Assert.assertEquals("Driving Task",task1.getTaskName());
        Assert.assertFalse(task1.isTaskExecuted());

        Assert.assertEquals("Shopping Task",task2.getTaskName());
        Assert.assertTrue(task2.isTaskExecuted());

        Assert.assertEquals("Painting Task", task3.getTaskName());
        Assert.assertFalse(task3.isTaskExecuted());

    }
}
