package Day20_6;

import static Day20_6.R.*;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LeftPane extends JPanel {
	
	public LeftPane() {
//		this.add(new Label("::: Input Panel :::"));

		JPanel rowPan1 = new JPanel();
		rowPan1.add(new JLabel("아이디 : "));
		rowPan1.add(txtFld1);
		JPanel rowPan2 = new JPanel();
		rowPan2.add(new JLabel("성    명 : "));
		rowPan2.add(txtFld2);
		JPanel rowPan3 = new JPanel();
		rowPan3.add(new JLabel("이메일 : "));
		rowPan3.add(txtFld3);
		JPanel rowPan4 = new JPanel();
		rowPan4.add(new JLabel("핸드폰 : "));
		rowPan4.add(txtFld4);
		
		JPanel rowPan5 = new JPanel();
		rowPan5.add(new JLabel("성별 : "));
		rowPan5.add(rb1);
		rowPan5.add(rb2);
		rbbox.add(rb1);
		rbbox.add(rb2);

		JPanel gridPan = new JPanel(new GridLayout(6, 1));
		gridPan.add(rowPan1);
		gridPan.add(rowPan2);
		gridPan.add(rowPan3);
		gridPan.add(rowPan4);
		gridPan.add(rowPan5);

		this.add(gridPan);
	}

	public static void main(String[] args) {
		new LeftPane().setVisible(true);
	}
}
