package cse4A;

import javax.swing.JFrame;

public class Main {
	public static void main(String args[]) {
		Game game=new Game();
		JFrame window=new JFrame("2048");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.add(game);
		window.pack();
		window.setVisible(true);
		game.start();
	}
}