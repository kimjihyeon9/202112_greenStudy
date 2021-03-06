package homework;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.Panel;
import java.awt.TextArea;

public class Cal extends MyFrame_hw {
	Panel p1 = new Panel(new GridLayout(7, 5, 5, 5));
	Panel p2 = new Panel(new GridLayout(1, 1));
	
	public Cal() {
		super("계산기", 300, 400);
		
		menubar();
		btn1();
		btn2();
		btn3();
		btn4();
		btn5();
		btn6();
	}
	
	public void btn1() {
		this.add(BorderLayout.WEST, p2);
		TextArea ta = new TextArea("", 30, 40);
		p2.add(ta);
		
		add(BorderLayout.SOUTH, p1);
		p1.add(new Button("MC"));
		p1.add(new Button("MR"));
		p1.add(new Button("MS"));
		p1.add(new Button("M+"));
		p1.add(new Button("M-"));
	}
	
	public void btn2() {
		add(BorderLayout.SOUTH, p1);
		p1.add(new Button("<-"));
		p1.add(new Button("CE"));
		p1.add(new Button("C"));
		p1.add(new Button("±"));
		p1.add(new Button("√"));
	}
	
	public void btn3() {
		add(BorderLayout.SOUTH, p1);
		p1.add(new Button("7"));
		p1.add(new Button("8"));
		p1.add(new Button("9"));
		p1.add(new Button("/"));
		p1.add(new Button("%"));
	}
	
	public void btn4() {
		add(BorderLayout.SOUTH, p1);
		p1.add(new Button("4"));
		p1.add(new Button("5"));
		p1.add(new Button("6"));
		p1.add(new Button("*"));
		p1.add(new Button("¹∕x"));
	}
	
	public void btn5() {
		add(BorderLayout.SOUTH, p1);
		p1.add(new Button("1"));
		p1.add(new Button("2"));
		p1.add(new Button("3"));
		p1.add(new Button("-"));
		p1.add(new Button("="));
	}
	
	public void btn6() {
		add(BorderLayout.SOUTH, p1);
		p1.add(new Button("0"));
		p1.add(new Button("0"));
		p1.add(new Button("."));
		p1.add(new Button("+"));
		p1.add(new Button("="));
	}
	
	public void menubar() {
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("View(V)");
		Menu m2 = new Menu("Edit(E)");
		Menu m3 = new Menu("Help(H)");
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		this.setMenuBar(mb);
	}

	public static void main(String[] args) {
		new Cal().setVisible(true);;
	}

}
