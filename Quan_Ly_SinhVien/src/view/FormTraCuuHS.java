package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import controller.ListenerBM1_BM3;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

// bm 3
public class FormTraCuuHS extends JPanel {
	private JTextField textField_Hoten;
	private JTextField textField_Lop;
	private JTable table;
	private FormAddHocSinh formAddHocSinh;
	/**
	 * Create the panel.
	 */
	public FormTraCuuHS() {
		formAddHocSinh = new FormAddHocSinh();
		ListenerBM1_BM3 listenerBM1_BM3 = new ListenerBM1_BM3(this);
		
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(0, 0, 958, 35);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BM3");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Danh sách học sinh");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(369, 11, 148, 14);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(0, 51, 958, 66);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Họ và Tên");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 17, 70, 30);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Lớp");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(342, 17, 70, 30);
		panel_1.add(lblNewLabel_2_1);
		
		textField_Hoten = new JTextField();
		textField_Hoten.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_Hoten.setBounds(96, 17, 180, 30);
		panel_1.add(textField_Hoten);
		textField_Hoten.setColumns(10);
		
		textField_Lop = new JTextField();
		textField_Lop.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_Lop.setColumns(10);
		textField_Lop.setBounds(422, 18, 180, 30);
		panel_1.add(textField_Lop);
		
		JButton btnTim = new JButton("Tìm");
		btnTim.addActionListener(listenerBM1_BM3);
		btnTim.setBackground(new Color(0, 204, 255));
		btnTim.setFont(new Font("Dialog", Font.BOLD, 13));
		btnTim.setBounds(835, 12, 100, 40);
		panel_1.add(btnTim);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Stt", "H\u1ECD v\u00E0 T\u00EAn", "L\u1EDBp", "Trung b\u00ECnh h\u1ECDc k\u00EC I", "Trung b\u00ECnh h\u1ECDc k\u00EC II"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setPreferredWidth(71);
		table.getColumnModel().getColumn(3).setPreferredWidth(121);
		table.getColumnModel().getColumn(4).setPreferredWidth(118);
		table.setRowHeight(25);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setLocation(10, 128);
		scrollPane.setSize(933, 386);
		
		scrollPane.setViewportView(table);
		
		
		add(scrollPane);
	}
	
	public void hienThiTimKiem() {
		
	}
	
}
