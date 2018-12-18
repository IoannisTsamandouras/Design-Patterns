package training;

public class RunMVC {
	private int initVal = 3;
	
	RunMVC(){
		Model model = new Model();
		View view = new View();
		model.addObserver(view);
		
		Controller controller = new Controller();
		controller.addModel(model);
		controller.addView(view);
		controller.initModel(initVal);
		
		view.addController(controller);
	}

}