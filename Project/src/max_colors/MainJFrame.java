package max_colors;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JRootPane;

import gameHowTo.GameHowTo;

// max color의 mainJFrame

public class MainJFrame extends JFrame {
	public static MaxColorPanel maxpan;
	
	Container c;

	public MainJFrame() {
		c = getContentPane();
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("주위 집중력 훈련 게임");
		setSize(1024, 768);

		c.add(new MaxColorPanel());
		
	}

	public static void main(String[] args) {
		new MainJFrame().setVisible(true);
	}

}
