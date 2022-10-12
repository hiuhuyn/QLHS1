package view.FormBaoCao;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Component;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class FormBaoCaoTongKetMon extends JPanel {

	private JTable jTable;

	/**
	 * Create the panel.
	 */
	public FormBaoCaoTongKetMon() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(0, 0, 940, 35);
		add(panel);
		
		JLabel lblBm = new JLabel("BM5.2");
		lblBm.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBm.setBounds(10, 11, 46, 14);
		panel.add(lblBm);
		
		JLabel lblNewLabel_1 = new JLabel("Báo cáo tổng kết học kì");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(369, 6, 175, 24);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(0, 46, 940, 66);
		add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Học kì");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 17, 70, 30);
		panel_1.add(lblNewLabel_2);
		
		JButton btn_tim = new JButton("Tìm");
		btn_tim.setBackground(new Color(0, 204, 255));
		btn_tim.setFont(new Font("Dialog", Font.BOLD, 14));
		btn_tim.setBounds(785, 17, 96, 36);
		panel_1.add(btn_tim);
		
		JComboBox comboBox_HocKi = new JComboBox();
		comboBox_HocKi.setBackground(new Color(255, 255, 255));
		comboBox_HocKi.setModel(new DefaultComboBoxModel(new String[] {"", "Học kì 1", "Học kì 2"}));
		comboBox_HocKi.setBounds(90, 15, 96, 38);
		panel_1.add(comboBox_HocKi);
		
		jTable = new JTable();
		jTable.setBackground(new Color(255, 255, 255));
		jTable.setFont(new Font("Tahoma", Font.PLAIN, 13));
		jTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"Stt", "L\u1EDBp", "S\u0129 s\u1ED1", "S\u1ED1 l\u01B0\u1EE3ng \u0111\u1EA1t", "T\u1EF7 l\u1EC7"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		jTable.getColumnModel().getColumn(0).setPreferredWidth(50);
		jTable.getColumnModel().getColumn(1).setPreferredWidth(71);
		jTable.getColumnModel().getColumn(2).setPreferredWidth(121);
		jTable.getColumnModel().getColumn(4).setPreferredWidth(118);
		jTable.setRowHeight(25);
		
		JScrollPane scrollPane = new JScrollPane(jTable);
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setBounds(10, 123, 920, 365);
		add(scrollPane);

	}

}
