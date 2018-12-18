package training;

public class CompositeDemo {
	
	public static void main(String[] args) {
		Department sales = new SalesDepartment(1, "Sales Department");
		Department it = new ITDepartment(2, "Information Technology");
		HeadDepartment hd = new HeadDepartment(3, "Head Department");
		
		hd.addDepartment(sales);
		hd.addDepartment(it);
		hd.printDepartment();
	}

}
