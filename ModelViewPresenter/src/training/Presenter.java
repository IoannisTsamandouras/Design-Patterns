package training;

public class Presenter {
	
	private Model model; 
	private View view;
	
	public Presenter(Model model, View view) {
		this.model = model;
		this.view = view;				
	}
	
	public void guess(String word) {
		String res = "Incorrect word";
		
		if(model.getPassword().equals(word)) {
			res = "Well done!";			
		}
		view.updateStatusLabel(res);
	}
}
