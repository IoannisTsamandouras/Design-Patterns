package training;

import java.awt.event.ActionEvent;

public class Controller implements java.awt.event.ActionListener {
	private Model model;
	private View view;
	
	public Controller() {
		System.out.println("Controller constructor...");
	}
	
	public void addModel(Model model) {
		this.model = model;
	}
	
	public void addView(View view) {
		this.view = view;
	}
	
	public void initModel(int val) {
		model.setValue(val);
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		model.increaseValue();		
	}

}
