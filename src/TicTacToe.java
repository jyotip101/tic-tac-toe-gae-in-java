import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener{

	Random random = new Random();
	
	JFrame frame = new JFrame("Tic-Tac-Toe");
	
	JPanel titlePanel1 = new JPanel();
	JPanel titlePanel2 = new JPanel();
		
	JLabel textLabel1 = new JLabel();
	JLabel textLabel2 = new JLabel();
	
	JPanel buttonPanel = new JPanel(); 
	JButton[] buttons = new JButton[9];
	
	boolean player;
	
	TicTacToe() {  
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 508);
		frame.getContentPane().setBackground(new Color(50, 50, 50)); 
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setVisible(true);
		 
		textLabel1.setForeground(new Color(251, 108, 109));
		textLabel1.setFont(new Font("Ink Free", Font.BOLD, 45));
		textLabel1.setHorizontalAlignment(JLabel.CENTER);
		textLabel1.setText("Tic-Tac-Toe"); 
 
		textLabel2.setForeground(new Color(251, 108, 109));
		textLabel2.setFont(new Font("Ink Free", Font.BOLD, 20));
		textLabel2.setHorizontalAlignment(JLabel.CENTER);
		textLabel2.setText("Starting..."); 
		
		titlePanel1.setLayout(new BorderLayout());
		titlePanel1.setBounds(0, 0, 400, 70); 
		titlePanel1.setBackground(new Color(25, 25, 25));
		
		titlePanel2.setLayout(new BorderLayout());
		titlePanel2.setBounds(0, 70, 400, 50); 
		titlePanel2.setBackground(new Color(25, 25, 25));


		buttonPanel.setBounds(0, 120, 400, 350); 
		buttonPanel.setLayout(new GridLayout(3, 3));
		buttonPanel.setBackground(new Color(22, 24, 30));

		for(int i=0; i<9; i++) {
			buttons[i] = new JButton();
			buttonPanel.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boil", Font.BOLD, 80)); 
			buttons[i].setForeground(new Color(25, 25, 25)); 

			buttons[i].setBackground(new Color(157, 166, 182));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}
		
		titlePanel1.add(textLabel1);
		titlePanel2.add(textLabel2);

		frame.add(titlePanel1 ) ;
		frame.add(titlePanel2 ) ;
		 
		frame.add(buttonPanel);
		
		oxTurn();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0; i<9; i++) {
			if(e.getSource() == buttons[i]) {
				if(player) {
					if(buttons[i].getText() == "") { 
						buttons[i].setText("X");
						player = false;
						textLabel2.setText("Player O");
						check();
					}
				}else {
					if(buttons[i].getText() == "") { 
						buttons[i].setText("O");
						player = true;
						textLabel2.setText("Player X");
						check();
					}
				}
			}
		}
		
	}
	
	public void oxTurn() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		
		if(random.nextInt(2) == 0) { 
			player = true;
			textLabel2.setText("Player X"); 
		}else {
			player = false;
			textLabel2.setText("Player O");
		}
	}
	
	public void check() {
		if(
				(buttons[0].getText() == "X") &&
				(buttons[1].getText() == "X") &&
				(buttons[2].getText() == "X")
				) {
			xPlayerWin(0, 1, 2);
		}
		if(
				(buttons[3].getText() == "X") &&
				(buttons[4].getText() == "X") &&
				(buttons[5].getText() == "X")
				) {
			xPlayerWin(3, 4, 5);
		}
		if(
				(buttons[6].getText() == "X") &&
				(buttons[7].getText() == "X") &&
				(buttons[8].getText() == "X")
				) {
			xPlayerWin(6, 7, 8);
		}
		if(
				(buttons[0].getText() == "X") &&
				(buttons[3].getText() == "X") &&
				(buttons[6].getText() == "X")
				) {
			xPlayerWin(0, 3, 6);
		}
		if(
				(buttons[1].getText() == "X") &&
				(buttons[4].getText() == "X") &&
				(buttons[7].getText() == "X")
				) {
			xPlayerWin(1, 4, 7);
		}
		if(
				(buttons[2].getText() == "X") &&
				(buttons[5].getText() == "X") &&
				(buttons[8].getText() == "X")
				) {
			xPlayerWin(2, 5, 8);
		}
		if(
				(buttons[0].getText() == "X") &&
				(buttons[4].getText() == "X") &&
				(buttons[8].getText() == "X")
				) {
			xPlayerWin(0, 4, 8);
		}
		if(
				(buttons[2].getText() == "X") &&
				(buttons[4].getText() == "X") &&
				(buttons[6].getText() == "X")
				) {
			xPlayerWin(2, 4, 6);
		}
		
		///
		
		if(
				(buttons[0].getText() == "O") &&
				(buttons[1].getText() == "O") &&
				(buttons[2].getText() == "O")
				) {
			oPlayerWin(0, 1, 2);
		}
		if(
				(buttons[3].getText() == "O") &&
				(buttons[4].getText() == "O") &&
				(buttons[5].getText() == "O")
				) {
			oPlayerWin(3, 4, 5);
		}
		if(
				(buttons[6].getText() == "O") &&
				(buttons[7].getText() == "O") &&
				(buttons[8].getText() == "O")
				) {
			oPlayerWin(6, 7, 8);
		}
		if(
				(buttons[0].getText() == "O") &&
				(buttons[3].getText() == "O") &&
				(buttons[6].getText() == "O")
				) {
			oPlayerWin(0, 3, 6);
		}
		if(
				(buttons[1].getText() == "O") &&
				(buttons[4].getText() == "O") &&
				(buttons[7].getText() == "O")
				) {
			oPlayerWin(1, 4, 7);
		}
		if(
				(buttons[2].getText() == "O") &&
				(buttons[5].getText() == "O") &&
				(buttons[8].getText() == "O")
				) {
			oPlayerWin(2, 5, 8);
		}
		if(
				(buttons[0].getText() == "O") &&
				(buttons[4].getText() == "O") &&
				(buttons[8].getText() == "O")
				) {
			oPlayerWin(0, 4, 8);
		}
		if(
				(buttons[2].getText() == "O") &&
				(buttons[4].getText() == "O") &&
				(buttons[6].getText() == "O")
				) {
			oPlayerWin(2, 4, 6);
		}
	}
	
	public void xPlayerWin(int a, int b, int c) {
 
		buttons[a].setBackground(new Color(251, 108, 109));
		buttons[b].setBackground(new Color(251, 108, 109));
		buttons[c].setBackground(new Color(251, 108, 109));

		for(int i=0; i<9; i++) {
			buttons[i].setEnabled(false);
		}
		textLabel2.setText("Player X wins");
	}
	
	public void oPlayerWin(int a, int b, int c) {
		buttons[a].setBackground(new Color(251, 108, 109));
		buttons[b].setBackground(new Color(251, 108, 109));
		buttons[c].setBackground(new Color(251, 108, 109));
		
		for(int i=0; i<9; i++) {
			buttons[i].setEnabled(false);
		}
		textLabel2.setText("Player Y wins");
	}
	
	public void reStartGame() {
		
	}

}
