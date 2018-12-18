package training;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class View {
	
	private Presenter presenter;
	private JLabel statusLabel;
	private JTextField inputField;
	
	public View() {
		UI();
	}
	
	private void UI() {
		statusLabel = new JLabel("Guess the right word: ");
		inputField = new JTextField(20);
		JButton btn = new JButton("Guess");
		btn.addActionListener((ActionEvent e) -> {
			presenter.guess(inputField.getText());
		});
		
		Box box = Box.createHorizontalBox();
		box.add(statusLabel);
		box.add(Box.createHorizontalStrut(5));
		box.add(inputField);
		box.add(Box.createHorizontalStrut(5));
		box.add(btn);
		
		JFrame frame = new JFrame("MVP Swing app");
		(frame.getContentPane()).setBackground(Color.white);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(box, BorderLayout.NORTH);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;		
	}
	
	public void updateStatusLabel(String text) {
		statusLabel.setText(text);		
	}

}
