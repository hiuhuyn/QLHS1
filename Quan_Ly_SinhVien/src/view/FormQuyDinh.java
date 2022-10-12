package view;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;

public class FormQuyDinh extends JPanel {
	private JTextField textField_tuoiMax;
	private JTextField textField_tuoiMin;
	private JTable jTable_QD2;
	private JTable jTable_QD5;
	private JTextField textField_DiemDat;
	private JTextField textField_lop;
	private JTextField textField_sstd;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public FormQuyDinh() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(0, 0, 958, 35);
		add(panel);
		
		JLabel lblBm = new JLabel("BM6");
		lblBm.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBm.setBounds(10, 11, 46, 14);
		panel.add(lblBm);
		
		JLabel lblNewLabel_1 = new JLabel("Các quy định");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(401, 6, 100, 24);
		panel.add(lblNewLabel_1);
		
		JPanel panel_QD1 = new JPanel();
		panel_QD1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_QD1.setBounds(10, 46, 442, 84);
		add(panel_QD1);
		panel_QD1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QD1: Thay đổi tuổi tối đa, tối thiểu\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 0, 300, 30);
		panel_QD1.add(lblNewLabel);
		
		JLabel lblTuiTia = new JLabel("Tuổi tối đa");
		lblTuiTia.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTuiTia.setBounds(10, 41, 76, 30);
		panel_QD1.add(lblTuiTia);
		
		JLabel lblTuiTiThiu = new JLabel("Tuổi tối thiểu");
		lblTuiTiThiu.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTuiTiThiu.setBounds(146, 41, 90, 30);
		panel_QD1.add(lblTuiTiThiu);
		
		textField_tuoiMax = new JTextField();
		textField_tuoiMax.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_tuoiMax.setText("23\r\n");
		textField_tuoiMax.setBounds(96, 41, 40, 30);
		panel_QD1.add(textField_tuoiMax);
		textField_tuoiMax.setColumns(10);
		
		textField_tuoiMin = new JTextField();
		textField_tuoiMin.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_tuoiMin.setText("6");
		textField_tuoiMin.setColumns(10);
		textField_tuoiMin.setBounds(246, 41, 40, 30);
		panel_QD1.add(textField_tuoiMin);
		
		JPanel panel_QD2 = new JPanel();
		panel_QD2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_QD2.setBounds(10, 146, 442, 304);
		add(panel_QD2);
		panel_QD2.setLayout(null);
		
		JLabel lblQdThayi = new JLabel("QD2: Thay đổi sĩ số tối đa của các lớp, thay đổi");
		lblQdThayi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQdThayi.setBounds(10, 0, 318, 30);
		panel_QD2.add(lblQdThayi);
		
		jTable_QD2 = new JTable();
		jTable_QD5 = new JTable();
		
		// jtable qd2
		jTable_QD2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"L\u1EDBp", "S\u0129 s\u1ED1 t\u1ED1i \u0111a"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		jTable_QD2.getColumnModel().getColumn(0).setPreferredWidth(118);
		jTable_QD2.getColumnModel().getColumn(1).setPreferredWidth(119);
		jTable_QD2.setRowHeight(25);
		
		// jtable quy dinh 5
		jTable_QD5.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00F4n", "\u0110i\u1EC3m \u0111\u1EA1t m\u00F4n"
			}
		));
		jTable_QD5.getColumnModel().getColumn(0).setPreferredWidth(50);
		jTable_QD5.getColumnModel().getColumn(1).setPreferredWidth(150);
		jTable_QD5.setRowHeight(25);
		
		JPanel panel_QD5 = new JPanel();
		panel_QD5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_QD5.setBounds(490, 46, 463, 368);
		add(panel_QD5);
		panel_QD5.setLayout(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("QD5: Thay đổi điểm đạt môn/đạt");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(10, 27, 300, 30);
		panel_QD5.add(lblNewLabel_2_2);
		
		JScrollPane scrollPane_QD5 = new JScrollPane(jTable_QD5);
		scrollPane_QD5.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_QD5.setBounds(10, 64, 443, 134);
		panel_QD5.add(scrollPane_QD5);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Điểm đạt");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2_1.setBounds(10, 275, 84, 30);
		panel_QD5.add(lblNewLabel_2_2_1);
		
		textField_DiemDat = new JTextField();
		textField_DiemDat.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_DiemDat.setColumns(10);
		textField_DiemDat.setBounds(86, 275, 112, 30);
		panel_QD5.add(textField_DiemDat);
		
		JLabel lblTnMn = new JLabel("Tên môn");
		lblTnMn.setBounds(10, 234, 76, 30);
		panel_QD5.add(lblTnMn);
		lblTnMn.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField = new JTextField();
		textField.setBounds(86, 234, 112, 30);
		panel_QD5.add(textField);
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setColumns(10);
		
		JButton btnXaMn = new JButton("Xóa môn");
		btnXaMn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXaMn.setBounds(320, 322, 112, 35);
		panel_QD5.add(btnXaMn);
		btnXaMn.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnXaMn.setBackground(new Color(0, 204, 255));
		
		JButton btnSaTnMn = new JButton("Edit môn");
		btnSaTnMn.setBounds(320, 272, 112, 35);
		panel_QD5.add(btnSaTnMn);
		btnSaTnMn.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSaTnMn.setBackground(new Color(0, 204, 255));
		
		
		
		JLabel lblNewLabel_2_1 = new JLabel("QD4: Thay số lượng, tên các môn học");
		lblNewLabel_2_1.setBounds(10, 0, 300, 30);
		panel_QD5.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnThmMn = new JButton("Thêm môn");
		btnThmMn.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnThmMn.setBackground(new Color(0, 204, 255));
		btnThmMn.setBounds(320, 219, 112, 35);
		panel_QD5.add(btnThmMn);
		
		JScrollPane scrollPane_QD2 = new JScrollPane(jTable_QD2);
		scrollPane_QD2.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane_QD2.setBounds(10, 67, 422, 121);
		panel_QD2.add(scrollPane_QD2);
		
		JLabel lblLp = new JLabel("Lớp");
		lblLp.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLp.setBounds(10, 199, 76, 30);
		panel_QD2.add(lblLp);
		
		textField_lop = new JTextField();
		textField_lop.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_lop.setColumns(10);
		textField_lop.setBounds(86, 199, 76, 30);
		panel_QD2.add(textField_lop);
		
		JLabel lblSSTi = new JLabel("Sĩ số tối đa");
		lblSSTi.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSSTi.setBounds(10, 246, 90, 30);
		panel_QD2.add(lblSSTi);
		
		textField_sstd = new JTextField();
		textField_sstd.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_sstd.setColumns(10);
		textField_sstd.setBounds(86, 246, 76, 30);
		panel_QD2.add(textField_sstd);
		
		JButton btnEdit = new JButton("Edit Lớp");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEdit.setBackground(new Color(0, 204, 255));
		btnEdit.setBounds(315, 199, 117, 35);
		panel_QD2.add(btnEdit);
		
		JButton btnDelete = new JButton("Xóa lớp");
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBackground(new Color(0, 204, 255));
		btnDelete.setBounds(315, 243, 117, 35);
		panel_QD2.add(btnDelete);
		
		JLabel lblSLngV = new JLabel("số lượng và tên các lớp trong trường");
		lblSLngV.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSLngV.setBounds(10, 26, 318, 30);
		panel_QD2.add(lblSLngV);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setBackground(new Color(0, 204, 255));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSave.setBounds(658, 440, 100, 48);
		add(btnSave);
		
		
		
		
		

	}

}
