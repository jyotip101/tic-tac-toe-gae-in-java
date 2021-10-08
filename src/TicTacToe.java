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
//		
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
		
	}
	
	public void xWins(int a, int b, int c) {
		
	}
	
	public void oWins(int a, int b, int c) {
		
	}

}
