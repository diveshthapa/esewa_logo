import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TdLogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new DrawFrame();
		frame.setTitle("Esewa 2D Logo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		      
    }

	
}
	class DrawFrame extends JFrame {
		public DrawFrame() {
			add(new DrawComponent());
	//resizes this window, taking into account the preferred sizes of its components
			pack();
		}
	}

	/**
	 * A component that displays 2d shapes.
	 */
	class DrawComponent extends JComponent {

		private static final int DEFAULT_WIDTH = 300;
		private static final int DEFAULT_HEIGHT = 300;
		
		
		public void paintComponent(Graphics g) {
			
			Graphics2D g2 = (Graphics2D) g;
			
			double leftX = 10;
			double topY = 180;
			double width = 220;
			double height = 200;
			
			Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
			
			//fill oval
			g2.setColor(Color.green);
			g2.fillOval(20, 30, 200, 200);
			
			//oval stroke
			g2.setStroke(new BasicStroke(13));
			g2.setColor(Color.white);
			
			//fill rectangle
			g2.setColor(Color.white);
			g2.fillRect(170,125, 50, 20);
			
			g.drawString("E-sewa",99,135);
			
			}

		public Dimension getPreferredSize() {
			return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		}
	

	}