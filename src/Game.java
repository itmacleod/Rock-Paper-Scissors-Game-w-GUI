import javax.swing.*;
import java.awt.BorderLayout;
public class Game extends JFrame{
	private JTextField p1txtField;
	public Game() {
		setTitle("Rock, Paper, Scissors");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lets Play Rock Paper Scissors!");
		lblNewLabel.setBounds(128, 6, 234, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Player 1's Choice:");
		lblNewLabel_1.setBounds(42, 48, 143, 21);
		getContentPane().add(lblNewLabel_1);
		
		p1txtField = new JTextField();
		p1txtField.setBounds(224, 45, 130, 26);
		getContentPane().add(p1txtField);
		p1txtField.setColumns(10);
	}

	public static void main(String[] args) {
		
		

	}

}
