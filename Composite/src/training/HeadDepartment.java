package training;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {
	private Integer id;
	private String name;
	private List<Department> departments;
	
	public HeadDepartment(Integer id, String name) {
		this.id = id;
		this.name = name;
		this.departments = new ArrayList<Department>();
	}

	public void printDepartment() {
		departments.forEach(Department::printDepartment);			
	}
	
	public void addDepartment(Department department) {
		departments.add(department);
	}
	
	public void removeDepartment(Department department) {
		departments.remove(department);
	}

}