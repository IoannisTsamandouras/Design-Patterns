package training;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

public class View implements Observer {
	private TextField textField;
	private Button button;
	
	
	public View() {
		System.out.println("View constructor...");
		Frame frame = new Frame("mvc app");
		frame.add("North", new Label("counter"));
		
		textField = new TextField();
		frame.add("Center", textField);
		
		Panel panel = new Panel();
		button = new Button("click");
		panel.add(button);
		frame.add("South", panel);
		
		frame.addWindowListener(new CloseListener());
		frame.setSize(300, 300);
		frame.setLocation(300, 300);
		frame.setVisible(true);		
	}
	
	public void setValue(int val) {
		textField.setText("" + val);
	}

	@Override
	public void update(Observable obs, Object obj) {
		textField.setText("" + ((Integer)obj).intValue());		
	}
	
	public void addController(ActionListener controller) {
		button.addActionListener(controller);
	}
	
	private class CloseListener extends WindowAdapter {
		public void closeWindowListener(WindowEvent e) {
			e.getWindow().setVisible(false);
			System.exit(1);
		}
	}

}
