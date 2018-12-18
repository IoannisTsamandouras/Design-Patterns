package training;

import java.time.LocalDate;

public class Task {
	
	private final long id;
	private String title;
	private String description;
	private boolean done;
	private LocalDate dueDate;
		
	Task(TaskBuilder builder) {
		this.id = builder.id;
		this.title = builder.title;
		this.description = builder.description;
		this.done = builder.done;
		this.dueDate = builder.dueDate;		
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public boolean isDone() {
		return done;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public long getId() {
		return id;
	}	

}
