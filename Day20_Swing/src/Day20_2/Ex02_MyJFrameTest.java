package Day20_2;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import gui_myframe.MyJFrame;

public class Ex02_MyJFrameTest extends MyJFrame {
//	Button btn = new Button(); // 부모생성자가 생성되지 않아서 오류가 난다
	JButton okBtn, resetBtn;
	JTextField txtFld1, txtFld2, txtFld3, txtFld4;
	JPanel centerPan, leftPan, mainPan, bottomPan;

	public void init() { // 한번에 보기 쉽게 정리!!
		okBtn = new JButton("가입하기");
		resetBtn = new JButton("다시쓰기");
		txtFld1 = new JTextField(15);
		txtFld2 = new JTextField(15);
		txtFld3 = new JTextField(15);
		txtFld4 = new JTextField(15);
		centerPan = new JPanel(new BorderLayout());
		leftPan = new JPanel(new GridLayout(4, 1));
		mainPan = new JPanel(new GridLayout(4, 1));
		bottomPan = new JPanel();
	}

	public Ex02_MyJFrameTest() {
		super("Member management system", 300, 300);
	}

	public static void main(String[] args) {
		new Ex02_MyJFrameTest().setVisible(true);
	}

	// 누군가가 MyJFrame을 상속 받으면 자동으로 displayLayer(), actionEvt()를 구현해야한다

	@Override
	protected void displayLayer() {
		init();
		// MyJFrame에 필드로 선언 되었다. Container contenPan
		contentPan = getContentPane(); // Frame 같은 존재

		GridBagLayout gridb = new GridBagLayout();

		contentPan.setLayout(gridb);
		contentPan.add(centerPan);
		centerPan.add(BorderLayout.WEST, leftPan);
		centerPan.add(BorderLayout.CENTER, mainPan);
		centerPan.add(BorderLayout.SOUTH, bottomPan);
		
		leftPan.add(new JLabel("성        명 : "));
		mainPan.add(txtFld1);
		
		leftPan.add(new JLabel("아  이  디 : "));
		mainPan.add(txtFld2);
		
		leftPan.add(new JLabel("패스워드 : "));
		mainPan.add(txtFld3);
		
		leftPan.add(new JLabel("나        이 : "));
		mainPan.add(txtFld4);

		bottomPan.add(okBtn);
		bottomPan.add(resetBtn);
	}

	@Override
	protected void actionEvt() {

	}

}
