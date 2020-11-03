
import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Dog {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 100;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/3;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 20;
	private static final int EYE_WIDTH = 10;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 10;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/4;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/5 * 2;
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 3;
	// whiskers are about 1/4 the size of the head
	private static final int WHISKER_LENGTH = HEAD_DIMENSION/4;
	private static final int WHISKER_SLANT = 5;
	private static final int NUM_WHISKERS = 3;

	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int dogX, int dogY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=dogX;
		int y=dogY;
		// Draw the head
		g2.setColor(Color.DARK_GRAY);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		// Draw the eyes
		g2.setColor(Color.blue);
		x = dogX + EYE_X; 
		y = dogY + EYE_Y;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.black);
		x = dogX + MOUTH_X;
		y = dogY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		g2.setColor(Color.black);
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("Woof", dogX, dogY+HEAD_DIMENSION+10);	



	}
}
