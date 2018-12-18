package training;

public class FactoryDemo {

	public static void main(String[] args) {
		Polygon p;
		PolygonFactory pf = new PolygonFactory();
		
		p = pf.getPolygon(4);
		System.out.println("The shape with 4 sides i-s a " + p.getType());
	}

}
