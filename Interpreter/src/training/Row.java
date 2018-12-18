package training;

public class Row {
	
	private String firstName;
	private String lastName;

	public Row(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override 
	public String toString() {
		return firstName + "" + lastName;
	}

}
