import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
		
public class Logo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				JFrame frame = new JFrame();
				frame.setTitle("Esewa Logo");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(300,300);
				JPanel panel = new JPanel() {
					@Override
					public void paint(Graphics g) {
						g.setColor(Color.green);
						g.fillOval(20, 30, 200, 200);
						
			//			g.setBorder(new BasicStroke(3));
			//			g.setColor(Color.white);
				//		((JComponent) g).paintBorder(7);
						
						
						g.drawOval(20, 30, 200, 200);
						g.setColor(Color.white);
						
						g.fillRect(170,125, 50, 20);
						g.setColor(Color.white);
					
					}
				};
				frame.add(panel);
				frame.setVisible(true);
			}

		}
