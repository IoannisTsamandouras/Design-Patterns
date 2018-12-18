package training;

public class PolygonFactory {
	
	public Polygon getPolygon(int sides) {
		if(sides == 3) {
			return new Triangle();
		}
		
		if(sides == 4) {
			return new Square();
		}
		
		if(sides == 5) {
			return new Pentagon();
		}
		
		if(sides == 7) {
			return new Heptagon();
		}
		else if(sides == 8) {
			return new Octagon();			
		}
		return null;
	}

}
