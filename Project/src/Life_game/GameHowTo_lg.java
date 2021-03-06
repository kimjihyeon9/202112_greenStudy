package Life_game;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

// 수정
// 2월 7일 - 59줄 추가

public class GameHowTo_lg extends JPanel implements ActionListener{
	JPanel pan1 = new JPanel();
	JPanel pan2 = new JPanel();
	JPanel pan3 = new JPanel();
	
	private ImageIcon bgSK;
	private JLabel bgSkPan;

	private JButton next ;
	private JButton prev;
	public JButton exit;

	private Font font1;
	
	int count = 0;

	public GameHowTo_lg() {
		this.setBackground(new Color(37,9,9));
		this.setLayout(null);
		comm();
		first();
		mid();
		last();
		prev.addActionListener(this);
		next.addActionListener(this);
		exit.addActionListener(this);
	}

	public void comm() {
		bgSK = new ImageIcon("images/HowTo_background.png");
		bgSkPan = new JLabel(bgSK);
		bgSkPan.setBounds(0, 0, 820, 525);
		bgSkPan.setLayout(null);
		
		font1 = new Font("맑은 고딕", Font.PLAIN, 24);

		next = new JButton(new ImageIcon("images/HowTo_right.png"));
		next.setFocusPainted(false);
		next.setBorderPainted(false); 
		next.setContentAreaFilled(false);
		next.setBounds(720, 230, 80, 80);
		prev = new JButton(new ImageIcon("images/HowTo_left.png"));
		prev.setFocusPainted(false);
		prev.setBorderPainted(false); 
		prev.setContentAreaFilled(false);
		prev.setBounds(25, 230, 80, 80);
		exit = new JButton(new ImageIcon("images/HowTo_exit.png"));
		exit.setFocusPainted(false);
		exit.setBorderPainted(false); 
		exit.setContentAreaFilled(false);
		exit.setBounds(720, 20, 80, 80);
		
		prev.setVisible(false); // 수정 (추가)
		bgSkPan.add(next);
		bgSkPan.add(prev);
		bgSkPan.add(exit);
		this.add(bgSkPan);
	}

	public void first() {
		pan1.setLayout(null);
		pan1.setBounds(130, 50, 570, 440);
		pan1.setBackground(Color.white);
		
		ImageIcon gameImg = new ImageIcon("images/HowTo_LifeGame_1.png");
		JLabel gameImgPan = new JLabel(gameImg);
		gameImgPan.setBounds(10, 10, 550, 300);

		JLabel text = new JLabel("글자 상자를 클릭해주세요");
		text.setFont(font1);
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setBounds(10, 320, 550, 120);
		text.setOpaque(true);
		text.setBackground(Color.white);
		Border c = new LineBorder(new Color(137, 170,108), 7);
		text.setBorder(c);

		pan1.add(text);
		pan1.add(gameImgPan);
		bgSkPan.add(pan1);
	}

	public void mid() {
		pan2.setLayout(null);
		pan2.setBounds(130, 50, 570, 440);
		pan2.setBackground(Color.white);
		
		ImageIcon gameImg = new ImageIcon("images/HowTo_LifeGame_2.png");
		JLabel gameImgPan = new JLabel(gameImg);
		gameImgPan.setBounds(10, 10, 550, 300);
		
		JLabel text = new JLabel("숫자 상자에 순서대로 넣어주세요");
		text.setFont(font1);
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setBounds(10, 320, 550, 120);
		text.setOpaque(true);
		text.setBackground(Color.white);
		Border c = new LineBorder(new Color(137, 170,108), 7);
		text.setBorder(c);
		
		pan2.setVisible(false);
		pan2.add(text);
		pan2.add(gameImgPan);
		bgSkPan.add(pan2);
	}

	public void last() {
		pan3.setLayout(null);
		pan3.setBounds(130, 50, 570, 440);
		pan3.setBackground(Color.white);

		ImageIcon gameImg = new ImageIcon("images/HowTo_LifeGame_3.png");
		JLabel gameImgPan = new JLabel(gameImg);
		gameImgPan.setBounds(10, 10, 550, 300);
		
		JLabel text = new JLabel("<html>제출을 눌러주세요.<br>기회는 두번입니다.</html>");
		text.setFont(font1);
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setBounds(10, 320, 550, 120);
		text.setOpaque(true);
		text.setBackground(Color.white);
		Border c = new LineBorder(new Color(137, 170,108), 7);
		text.setBorder(c);
		
		pan3.setVisible(false);
		pan3.add(text);
		pan3.add(gameImgPan);
		bgSkPan.add(pan3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == prev) {
			count--;
		}
		if(e.getSource() == next) {
			count++;
		}
//		if(e.getSource() == exit) {
//			this.setVisible(false);
//		}
		
		if(e.getSource() == prev || e.getSource() == next) {
			if(count == 0) {
				prev.setVisible(false);
				next.setVisible(true); 
				pan1.setVisible(true);
				pan2.setVisible(false);
				pan3.setVisible(false);
				revalidate();
				repaint();
			} else if(count == 1) {
				prev.setVisible(true);
				next.setVisible(true);
				pan1.setVisible(false);
				pan2.setVisible(true);
				pan3.setVisible(false);
				revalidate();
				repaint();
			} else if(count == 2) {
				prev.setVisible(true);
				next.setVisible(false);
				pan1.setVisible(false);
				pan2.setVisible(false);
				pan3.setVisible(true);
				revalidate();
				repaint();
			}
		}
	}
}
