package command;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.Vector;

public class PanelReceiver extends JPanel {
	private static final long serialVersionUID = 1L;

	private Vector<Integer>data;
	private int height,y0;
	public PanelReceiver(int height) {
		data = new Vector<>();
		this.height = height;
		y0 = height/2;
		setBorder(new LineBorder(Color.BLUE));
		setBackground(Color.WHITE);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.RED);
		g.drawLine(0, y0, getWidth(), y0);
		g.setColor(Color.BLUE);
		
		for (int x = 1; x < data.size(); x++) {
			g.drawLine(x - 1, y0-data.get(x-1), x, y0-data.get(x));
		}
	}
	
	public void action(int element) {
		data.add(element);
		repaint();
	}

	@Override
	public Dimension getPreferredSize() {
		
		return new Dimension(super.getPreferredSize().width , height);
	}
}
