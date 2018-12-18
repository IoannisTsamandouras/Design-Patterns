package training;

public abstract class Fir implements ChristmasTree {
	
	private ChristmasTree tree;
	
	public Fir(ChristmasTree tree) {
		this.tree = tree;		
	}
	
	@Override
	public String decorate() {
		return tree.decorate();
	}

}
