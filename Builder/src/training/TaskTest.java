package training;

import java.time.LocalDate;

public class TaskTest {

	public static void main(String[] args) {
		Task task = 
				new TaskBuilder(41, "write an application")
				.withDescription("A simple task")
				.withDueDate(LocalDate.now())
				.isCompleted(true)
				.build();
		
		System.out.println(" Task id: " + task.getId() + " \n Title " + task.getTitle() 
		+ " \n Completed: " + task.isDone() + ". \n Description: " + task.getDescription() 
		+ " \n Deadline: " + task.getDueDate());
	}

}
