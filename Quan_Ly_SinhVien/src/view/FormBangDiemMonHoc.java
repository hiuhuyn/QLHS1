package view;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class FormBangDiemMonHoc extends JPanel {
	private JTextField textField_lop;
	private JTable jTable;

	/**
	 * Create the panel.
	 */
	public FormBangDiemMonHoc() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(0, 0, 958, 35);
		add(panel);
		
		JLabel lblNewLabel = new JLabel("BM4");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bảng điểm môn học");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(365, 6, 148, 24);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(0, 46, 958, 97);
		add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lớp");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 17, 53, 30);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Môn");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(212, 17, 53, 30);
		panel_1.add(lblNewLabel_2_1);
		
		textField_lop = new JTextField();
		textField_lop.setColumns(10);
		textField_lop.setBounds(73, 18, 129, 30);
		panel_1.add(textField_lop);
		
		JButton btn_tim = new JButton("Tìm");
		btn_tim.setBackground(new Color(51, 204, 255));
		btn_tim.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_tim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_tim.setBounds(601, 30, 100, 40);
		panel_1.add(btn_tim);
		
		JLabel lblNewLabel_2_2 = new JLabel("Học kì");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_2.setBounds(10, 56, 53, 30);
		panel_1.add(lblNewLabel_2_2);
		
		JButton btn_Save = new JButton("Save");
		btn_Save.setBackground(new Color(51, 204, 255));
		btn_Save.setBounds(828, 30, 100, 40);
		panel_1.add(btn_Save);
		btn_Save.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btn_edit = new JButton("Edit");
		btn_edit.setBackground(new Color(51, 204, 255));
		btn_edit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn_edit.setBounds(711, 30, 100, 40);
		panel_1.add(btn_edit);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Toán", "Văn", "Lý", "Hóa", "Sinh", "Sử", "Địa", "Đạo đức", "Thể chất"}));
		comboBox.setBounds(269, 17, 157, 30);
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Học kì 1", "Học kì 2"}));
		comboBox_1.setBounds(73, 58, 129, 30);
		panel_1.add(comboBox_1);
		
		jTable = new JTable();
		jTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Stt", "H\u1ECD v\u00E0 T\u00EAn", "\u0110i\u1EC3m 15p", "\u0110i\u1EC3m 1 ti\u1EBFt", "\u0110i\u1EC3m TB"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		jTable.getColumnModel().getColumn(0).setPreferredWidth(30);
		jTable.getColumnModel().getColumn(1).setPreferredWidth(150);
		jTable.getColumnModel().getColumn(2).setPreferredWidth(100);
		jTable.getColumnModel().getColumn(3).setPreferredWidth(121);
		jTable.getColumnModel().getColumn(4).setPreferredWidth(118);
		jTable.setRowHeight(25);
		
		
		JScrollPane scrollPane = new JScrollPane(jTable);
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setBounds(10, 154, 933, 355);
		add(scrollPane);

	}
}
