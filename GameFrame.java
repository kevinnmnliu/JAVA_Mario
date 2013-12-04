package devforrest.mario.core;

import javax.swing.JFrame;

// This is the main entry point..

public class GameFrame extends JFrame {
	
	public GameFrame(int levels) {	
		
		int w = 420;
		int h = 330;       
		setSize(w, h);
		setResizable(false);
		setTitle("Game Frame"); 
		GamePanel panel = new GamePanel(w, h, levels);
		add(panel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);	

	}
	
	public static void main(String[] args) {
		new GameFrame(4);
	}

}
