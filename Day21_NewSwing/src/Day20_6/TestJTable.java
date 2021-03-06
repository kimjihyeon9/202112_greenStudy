package Day20_6;

import static Day20_6.R.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.sound.midi.Sequence;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import gui_myframe.MyJFrame;

public class TestJTable extends MyJFrame {
	
	
	public TestJTable() {
		super("JTable 연습", 640, 480);
	}
	
	private void mkTableData(){
		colNames = new Vector();
		colNames.add("IDX");
		colNames.add("NAME");
		colNames.add("EMAIL");
		colNames.add("PHONE");
		
		// Object[][] 배열을 대체하는 코드
		data = dao.selectAll();
//				new Object[][] {
//			{1, "hong", "hong@naver.com", "010-1234-5678"},
//			{2, "kim", "kim@naver.com", "010-2222-2222"},
//			{3, "lee", "lee@naver.com", "010-3333-3333"}
//		};
	}

	@Override
	protected void displayLayer() {
		mkTableData();
		
		contentPan = getContentPane();
		
		contentPan.add(BorderLayout.WEST, new LeftPane());
		contentPan.add(BorderLayout.SOUTH, new BottomPane());
//		contentPan.add(BorderLayout.NORTH, new CheckBoxEvent());
		
		tbModel = new DefaultTableModel(data, colNames);
		table = new JTable(tbModel);
		
		scrollPane = new JScrollPane(table);
		contentPan.add(scrollPane);
		
//		addRowDataTest();
	}
	
	private void addRowDataTest() {
		tbModel.setDataVector(null, colNames); // 정보 초기화, 테이블만 남는다
		tbModel.addRow(new Object[] {4, "aaa", "aaa@naver,com", "010-4444-4444"});
		tbModel.addRow(new Object[] {5, "bbb", "bbb@naver,com", "010-5555-5555"});
	}
	
	private void displayList() {
		tbModel.setDataVector(null, colNames);
		Vector<Vector> saramList = dao.selectAll();
		for(Vector vector : saramList) {
			tbModel.addRow(vector);
		}
//		tbModel.addRow(new Object[] {4, "aaa", "aaa@naver.com", "010-4444-4444"});
	}

	@Override
	protected void actionEvt() {
		// 버튼 이벤트 핸들러 추가
		allbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>> All Button 클릭!");
				displayList();
			}
		});
		
		inputbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>> Input Button 클릭!");
				
				// textField의 데이터를 읽어온다.
				String name = txtFld2.getText();
				txtFld2.setText("");
				String email = txtFld3.getText();
				txtFld3.setText("");
				String phone = txtFld4.getText();
				txtFld4.setText("");
				System.out.println("name => " + name);
				System.out.println("email => " + email);
				System.out.println("phone => " + phone);
				
				// TableModel에 반영해주기
//				tbModel.addRow(new Object[] {sequence++, name, email, phone});
				// 이제는 바로 넣어주는게 아니라 dao에 저장 후
				dao.insert(new SaramDTO(0, name, email, phone));
				
				// list를 다시 그려준다
				displayList();
			}

		});
		
		searchbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>> Search Button 클릭!");
//				JOptionPane.showMessageDialog(TestJTable.this, "찾는 이름을 입력하세요");
				String name = txtFld2.getText();
				Vector<Vector> saramList = dao.selectList(new SaramDTO(0, name, null, null));
				tbModel.setDataVector(null, colNames);
				for(Vector vector : saramList) {
					tbModel.addRow(vector);
				}
				
//				dao.search(new SaramDTO(sequence, null,null,null));
			}
		});
		
		modifybtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>> Modify Button 클릭!");
				
				int idx = Integer.parseInt(txtFld1.getText());
				String name = txtFld2.getText();
				String email = txtFld3.getText();
				String phone = txtFld4.getText();
				Vector vector = dao.modify(new SaramDTO(idx, name, email, phone)); 
//				tbModel.setDataVector(null, columnNames);
//				tbModel.addRow(vector);
				displayList();
			}
		});
		
		deletebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>> Delete Button 클릭!");
				
				int idx = Integer.parseInt(txtFld1.getText());
				String name = txtFld2.getText();
				String email = txtFld3.getText();
				String phone = txtFld4.getText();
				Vector vector = dao.delete(new SaramDTO(idx, name, email, phone)); 
//				tbModel.setDataVector(null, columnNames);
//				tbModel.addRow(vector);
				displayList();
			}
		});
		
		finishbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(">>> Finish Button 클릭!");
				JOptionPane.showMessageDialog(TestJTable.this, "굿바이~");
				dispose();
				System.exit(0);
			}
		});
		
		// 데이블 이벤트 핸들러 추가
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(">>> 마우스를 눌렀다!");
				JTable tbl = (JTable) e.getSource();
				// 테이블의 전체 행과 열 알아내기
				int totalCol = tbl.getColumnCount();
				int totalRow = tbl.getRowCount();
//				System.out.println(row +  ", " + col); // 테이블의 전체 수가 나온다
				
				// 선택한 컬럼의 행과 열 알아내기
				int col = table.getSelectedColumn();
				int row = table.getSelectedRow();
//				System.out.println(row +  ", " + col); // 테이블의 위치가 나온다
				
				// 데이터 찾아오기
				int idx = (int) tbModel.getValueAt(row, 0);
				String name = (String) tbModel.getValueAt(row, 1);
				String email = (String) tbModel.getValueAt(row, 2);
				String phone = (String) tbModel.getValueAt(row, 3);
				System.out.println(idx + ", " + name + ", " + email + ", " + phone);
				
				// 찾아 온 데이터 적용하기
				txtFld1.setText("" + idx);
				txtFld2.setText(name);
				txtFld3.setText(email);
				txtFld4.setText(phone);
				
				// 버튼 이벤트 핸들러 추가
//				allBtn.setBorderPainted(false); --> 보더 지우기
//				allBtn.setContentAreaFilled(false); --> area지우기
			}
				
		});
	}
	
	public static void main(String[] args) {
		new TestJTable().setVisible(true);
	}

}
