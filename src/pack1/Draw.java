package pack1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Draw extends JLabel {
	
	private static final long serialVersionUID = 1L;
	
	protected void paintComponent (Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		//draw//
		
		g.setColor(new Color(255,230,204));
		g.fillRect(0, 0, 800, 600);
		
		g.setColor(Color.BLACK);
		
		//Vertikal
		
		g.drawLine(325, 50, 325, 500);
		g.drawLine(475, 50, 475, 500);
		
		// Horizontal
		
		g.drawLine(175, 200, 625, 200);
		g.drawLine(175, 350, 625, 350);
		
		// Draw Player
		
		if(GUI.player == 0 && GUI.winner == 0) {
			g.setColor(Color.BLUE);
			g.drawString("Player: X", 25, 50);
			g.drawLine(20, 55, 80, 55);
			g.drawLine(20, 35, 80, 35);
			g.drawLine(20, 55, 20, 35);
			g.drawLine(80, 55, 80, 35);
		}else if(GUI.player == 1 && GUI.winner == 0) {
			g.setColor(Color.MAGENTA);
			g.drawString("Player: O", 25, 50);
			g.drawLine(20, 55, 80, 55);
			g.drawLine(20, 35, 80, 35);
			g.drawLine(20, 55, 20, 35);
			g.drawLine(80, 55, 80, 35);
		}
		
		// Draw Winner
		
		if(GUI.winner == 1) {
			g.setColor(Color.BLUE);
			g.drawString("Winner: X", 25, 100);
			g.setColor(Color.BLACK);
			g.drawString("Reset to play again", 25, 120);
		}else if(GUI.winner == 2) {
			g.setColor(Color.MAGENTA);
			g.drawString("Winner: O", 25, 100);
			g.setColor(Color.BLACK);
			g.drawString("Reset to play again", 25, 120);
		}
		
		// No Winner (Draw)
		if(GUI.winner == 3) {
			g.drawString(" -- Draw -- ", 25, 100);
			g.drawString("Reset to play again", 25, 120);
		}
		
		// Reihe 1
		
		if(GUI.state[0] == 1) {
			g.drawImage(ImageLoader.imgX, 175, 50, 150, 150, null);
		}else if(GUI.state[0] == 2) {
			g.drawImage(ImageLoader.imgO, 175, 50, 150, 150, null);
		}
		
		if(GUI.state[1] == 1) {
			g.drawImage(ImageLoader.imgX, 325, 50, 150, 150, null);
		}else if(GUI.state[1] == 2) {
			g.drawImage(ImageLoader.imgO, 325, 50, 150, 150, null);
		}
		
		if(GUI.state[2] == 1) {
			g.drawImage(ImageLoader.imgX, 475, 50, 150, 150, null);
		}else if(GUI.state[2] == 2) {
			g.drawImage(ImageLoader.imgO, 475, 50, 150, 150, null);
		}
		
		// Reihe 2
		
		if(GUI.state[3] == 1) {
			g.drawImage(ImageLoader.imgX, 175, 200, 150, 150, null);
		}else if(GUI.state[3] == 2) {
			g.drawImage(ImageLoader.imgO, 175, 200, 150, 150, null);
		}
		
		if(GUI.state[4] == 1) {
			g.drawImage(ImageLoader.imgX, 325, 200, 150, 150, null);
		}else if(GUI.state[4] == 2) {
			g.drawImage(ImageLoader.imgO, 325, 200, 150, 150, null);
		}
		
		if(GUI.state[5] == 1) {
			g.drawImage(ImageLoader.imgX, 475, 200, 150, 150, null);
		}else if(GUI.state[5] == 2) {
			g.drawImage(ImageLoader.imgO, 475, 200, 150, 150, null);
		}
		
		// Reihe 3
		
		if(GUI.state[6] == 1) {
			g.drawImage(ImageLoader.imgX, 175, 350, 150, 150, null);
		}else if(GUI.state[6] == 2) {
			g.drawImage(ImageLoader.imgO, 175, 350, 150, 150, null);
		}
		
		if(GUI.state[7] == 1) {
			g.drawImage(ImageLoader.imgX, 325, 350, 150, 150, null);
		}else if(GUI.state[7] == 2) {
			g.drawImage(ImageLoader.imgO, 325, 350, 150, 150, null);
		}
		
		if(GUI.state[8] == 1) {
			g.drawImage(ImageLoader.imgX, 475, 350, 150, 150, null);
		}else if(GUI.state[8] == 2) {
			g.drawImage(ImageLoader.imgO, 475, 350, 150, 150, null);
		}
		repaint();
	}
}
