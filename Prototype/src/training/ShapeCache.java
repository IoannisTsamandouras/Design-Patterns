package training;

import java.util.Hashtable;

public class ShapeCache {
	
	private static Hashtable<Integer, Shape> map = new Hashtable<Integer, Shape>(); 
	
	public static Shape getShape(int id) {
		Shape shape = map.get(id);
		return (Shape) shape.clone();
	}
	
	public static void cache() {
		Circle c = new Circle();
		c.setId(1);
		map.put(c.getId(), c);
		
		Square s = new Square();
		s.setId(2);
		map.put(s.getId(), s);
		
		Rectangle r = new Rectangle();
		r.setId(3);
		map.put(r.getId(), r);
		
	}

}
