package training;

import javax.swing.SwingUtilities;

public class MVPdemo {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			View view = new View();
			view.setPresenter(new Presenter(new Model(), view));
		});
	}

}
