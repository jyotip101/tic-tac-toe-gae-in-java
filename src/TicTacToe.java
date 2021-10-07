import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener{

	Random random = new Random();
	JFrame frame = new JFrame("Tic-Tac-Toe");
	JPanel titlePanel = new JPanel();
	JPanel buttonPanel = new JPanel();
	JLabel textLabel = new JLabel();
	JLabel playerTurnLabel = new JLabel();
	JButton[] buttons = new JButton[9];
	boolean playerTurn;
	
	TicTacToe() { 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 600);
//		frame.getContentPane().setBackground(new Color(50, 50, 50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		textLabel.setBackground(new Color(25, 25, 25));
//		textLabel.setForeground(new Color(25, 255, 0));
		textLabel.setForeground(new Color(251, 108, 109));
		textLabel.setFont(new Font("Ink Free", Font.BOLD, 75));
//		textLabel.setHorizontalAlignment(JLabel.CENTER);
		textLabel.setText("Tic-Tac-Toe");
		textLabel.setOpaque(true);
		
		titlePanel.setLayout(new BorderLayout());
		titlePanel.setBounds(10, 0, 500, 200);
		
//		playerTurnLabel.setLayout(new BorderLayout());
//		playerTurnLabel.setBounds(0, 100, 800, 100);
		playerTurnLabel.setText("Tic-Tac-Toe2");
		
		buttonPanel.setLayout(new GridLayout(3, 3));
		buttonPanel.setBackground(new Color(22, 24, 30));
//		
//		for(int i=0; i<9; i++) {
//			buttons[i] = new JButton();
//			buttonPanel.add(buttons[i]);
//			buttons[i].setFont(new Font("MV Boil", Font.BOLD, 120));
////			buttons[i].setText("" + (i + 1)); 
////			font color buttons[i].setBackground(new Color(61, 64, 91));
////		background	buttons[i].setBackground(new Color(244, 241, 222));
////			buttons[i].setBackground(new Color(221, 147, 86));
//
//			buttons[i].setBackground(new Color(157, 166, 182));
//			buttons[i].setFocusable(false);
//			buttons[i].addActionListener(this);
//		}
		
		titlePanel.add(textLabel);
		titlePanel.add(playerTurnLabel);
		frame.add(titlePanel, BorderLayout.NORTH);
		frame.add(buttonPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	}
	
	public void fistTurn() {
		
	}
	
	public void check() {
		
	}
	
	public void xWins(int a, int b, int c) {
		
	}
	
	public void oWins(int a, int b, int c) {
		
	}

}
