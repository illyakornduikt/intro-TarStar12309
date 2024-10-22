package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	
	// Screen settings
	final int origanalTitleSize = 16; // 16 x 16 
	final int scale = 3;
	
	final int titleSize = origanalTitleSize * scale; // 48 x 48
	final int maxScreenCol = 16;
	final int maxScreenRow= 12;
	final int screenWidth = titleSize * maxScreenCol; // 768 pix
	final int screenHeight = titleSize * maxScreenRow; // 567 pix
	
	Thread gameThead;
	
	public GamePanel() {

		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
	}
	
	public void startGameThread() {
		gameThead = new Thread(this);
		gameThead.start();
	}
	
	
	@Override
	public void run() {
		 while(gameThead != null) {
			 // Update information
			 update();
			 // вивести на екран оновлену інфорацію
			 repaint();
			 
		 }
		
	}
	public void  update() {
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		 g2.setColor(Color.white);
		 
		 g2.fillRect(100,100, titleSize, titleSize);
		 
		 g2.dispose();
		 
	}
}











