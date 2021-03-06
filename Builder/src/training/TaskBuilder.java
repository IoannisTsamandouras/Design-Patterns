package training;

import java.time.LocalDate;

public class TaskBuilder {
	
	final long id;
	String title;
	String description;
	boolean done;
	LocalDate dueDate;
	
	public TaskBuilder(long id, String title) {
		this.id = id;
		this.title = title;
	}	
	
	public TaskBuilder isCompleted(boolean done) {
		this.done = done;
		return this;
	}
	
	public TaskBuilder withDueDate(LocalDate localDate) {
		this.dueDate = localDate;
		return this;
	}

	public TaskBuilder withDescription(String description) {
		this.description = description;
		return this;
	}	
	
	public Task build() {
		return new Task(this);
	}

}
