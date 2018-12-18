package training;

public class PrototypeDemo {
	
	public static void main(String[] args) {
		ShapeCache.cache();
		
		Shape cloned = (Shape) ShapeCache.getShape(1);
		System.out.println("Shape 1: " + cloned.getType());
		
		Shape cloned1 = (Shape) ShapeCache.getShape(2);
		System.out.println("Shape 2: " + cloned1.getType());
		
		Shape cloned2 = (Shape) ShapeCache.getShape(3);
		System.out.println("Shape 3: " + cloned2.getType());
	}	

}
