import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Game extends JFrame{
	private JTextField p1txtField;
	private JTextField p2txtField;
	private JLabel result;
	
	public void playGame() {
		
		String gameresult = " ";
		
		String player1Choice = p1txtField.getText();
		String player2Choice = p2txtField.getText();
		
		if(player1Choice.equalsIgnoreCase("scissors") && (player2Choice.equalsIgnoreCase("paper"))){
			gameresult = "Player 1 Wins!";
		}else if(player1Choice.equalsIgnoreCase("rock") && player2Choice.equalsIgnoreCase("scissors")) {
			gameresult = "Player 1 Wins!";
		}else if(player1Choice.equalsIgnoreCase("paper") && player2Choice.equalsIgnoreCase("rock")) {
			gameresult = "Player 1 Wins!";
		}else if(player1Choice.equals(player2Choice)){
			gameresult = "Tie!";
		}else {
			gameresult = "Player 2 Wins!";
		}
		
		result.setText(gameresult);
	}
	
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
		
		JLabel lblNewLabel_2 = new JLabel("Player 2's Choice:");
		lblNewLabel_2.setBounds(42, 122, 110, 16);
		getContentPane().add(lblNewLabel_2);
		
		p2txtField = new JTextField();
		p2txtField.setBounds(224, 117, 130, 26);
		getContentPane().add(p2txtField);
		p2txtField.setColumns(10);
		
		JButton btnNewButton = new JButton("Rock, Paper, Scissors....Shoot!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playGame();
			}
		});
		btnNewButton.setBounds(97, 179, 240, 26);
		getContentPane().add(btnNewButton);
		
		result = new JLabel("Type each players choice...\n");
		result.setBounds(128, 232, 192, 16);
		getContentPane().add(result);
	}

	public static void main(String[] args) {
		
		Game game = new Game();
		game.setSize(400,350);
		game.setVisible(true);
		

	}

}
