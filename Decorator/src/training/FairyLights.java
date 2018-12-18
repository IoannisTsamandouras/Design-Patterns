package training;

public class FairyLights extends Fir {
	
	 public FairyLights(ChristmasTree fir) {
		super(fir);
	}
	 
	 public String decorate() {
		 return super.decorate() + illuminate();
	 }
	 
	 private String illuminate() {
		 return " with fairy lights";
	 }
	 
}
