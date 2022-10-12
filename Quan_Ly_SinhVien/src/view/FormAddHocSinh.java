package view;


import controller.ListenerBM1_BM3;
import model.QLSVModel;
import model.SinhVien;

import java.awt.*;
import java.awt.dnd.DnDConstants;
import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import java.util.*;
import java.awt.event.ActionListener;

public class FormAddHocSinh extends JPanel {
	private QLSVModel model;
	private JTextField textField_name;
	private JTextField textField_namsinh;
	private JTextField textField_email;
	private JTextField textField_gioiTinh;
	private JTextField textField_diaChi;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public FormAddHocSinh() {
		model = new QLSVModel();
		setBorder(new LineBorder(new Color(0, 0, 0)));
		
		setSize(975, 500);
		setLayout(null);
		
		ListenerBM1_BM3 listenerBM1 = new ListenerBM1_BM3(this);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 955, 197);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"H\u1ECD t\u00EAn", "Gi\u1EDBi t\u00EDnh", "N\u0103m sinh", "\u0110\u1ECBa ch\u1EC9", "Email"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(60);
		table.getColumnModel().getColumn(3).setPreferredWidth(179);
		table.getColumnModel().getColumn(4).setPreferredWidth(235);
		table.setRowHeight(25);
		table.setBounds(55, 112, 67, -25);
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		scrollPane.setColumnHeaderView(panel);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BM1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hồ sơ học sinh");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(428, 11, 119, 14);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(10, 253, 955, 215);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2_5 = new JLabel("Thêm học sinh");
		lblNewLabel_2_5.setBounds(387, 5, 105, 19);
		panel_1.add(lblNewLabel_2_5);
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_2 = new JLabel("Họ và tên");
		lblNewLabel_2.setBounds(10, 42, 77, 31);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		textField_name = new JTextField();
		textField_name.setBounds(97, 42, 279, 31);
		panel_1.add(textField_name);
		textField_name.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_name.setColumns(10);
		
		JLabel lblNewLabel_2_4 = new JLabel("Địa chỉ");
		lblNewLabel_2_4.setBounds(10, 84, 77, 31);
		panel_1.add(lblNewLabel_2_4);
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		textField_diaChi = new JTextField();
		textField_diaChi.setBounds(97, 84, 279, 31);
		panel_1.add(textField_diaChi);
		textField_diaChi.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_diaChi.setColumns(10);
		
		JLabel lblNewLabel_2_2 = new JLabel("Email");
		lblNewLabel_2_2.setBounds(10, 126, 70, 31);
		panel_1.add(lblNewLabel_2_2);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		textField_email = new JTextField();
		textField_email.setBounds(97, 126, 279, 31);
		panel_1.add(textField_email);
		textField_email.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_email.setColumns(10);
		
		textField_gioiTinh = new JTextField();
		textField_gioiTinh.setBounds(484, 42, 136, 31);
		panel_1.add(textField_gioiTinh);
		textField_gioiTinh.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_gioiTinh.setColumns(10);
		
		textField_namsinh = new JTextField();
		textField_namsinh.setBounds(484, 84, 136, 31);
		panel_1.add(textField_namsinh);
		textField_namsinh.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_namsinh.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Năm sinh");
		lblNewLabel_2_1.setBounds(397, 84, 77, 31);
		panel_1.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_2_3 = new JLabel("Giới tính");
		lblNewLabel_2_3.setBounds(397, 42, 77, 31);
		panel_1.add(lblNewLabel_2_3);
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(listenerBM1);
		btnDelete.setBounds(784, 168, 112, 31);
		panel_1.add(btnDelete);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBackground(new Color(0, 204, 255));
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(784, 126, 112, 31);
		panel_1.add(btnReset);
		btnReset.setBackground(new Color(0, 204, 255));
		btnReset.addActionListener(listenerBM1);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(listenerBM1);
		btnEdit.setBounds(784, 84, 112, 31);
		panel_1.add(btnEdit);
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEdit.setBackground(new Color(0, 204, 255));
		
		JButton btn_Add = new JButton("Add");
		
		btn_Add.addActionListener(listenerBM1);
		btn_Add.setBounds(784, 42, 112, 31);
		panel_1.add(btn_Add);
		
		btn_Add.setBackground(new Color(0, 204, 255));
		btn_Add.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(0, 0, 975, 35);
		add(panel_2);
		
		JLabel lblBm = new JLabel("BM1");
		lblBm.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBm.setBounds(10, 11, 46, 14);
		panel_2.add(lblBm);
		
		JLabel lblNewLabel_1_1 = new JLabel("Hồ sơ học sinh");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(403, 6, 148, 24);
		panel_2.add(lblNewLabel_1_1);
	}
	
	public QLSVModel getQlsvModel() {
		return model;
	}
	
	public void resetForm() {
		textField_name.setText("");
		textField_diaChi.setText("");
		textField_email.setText("");
		textField_gioiTinh.setText("");
		textField_namsinh.setText("");
	}
	
	public void addSV_InTable(SinhVien sv) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		model_table.addRow(new Object[] {
				sv.getHoTen() + "",
				sv.getGioiTinh() + "", 
				
				sv.getNamSinh()+"",
				sv.getDiaChi() + "",
				sv.getEmail()+""
				
		});
		
	}
	
	// chỉnh sửa sinh viên
	public void add_or_editSV(SinhVien sv) {
		DefaultTableModel modelTable =  (DefaultTableModel) table.getModel();
		// kiem tra ton tai de them hoac sua
		if(!this.model.kiemTraTonTai(sv)) {
			System.out.println("Chưa tồn tại");
			this.model.insertSV(sv);
			this.addSV_InTable(sv);
		}
		else {
			System.out.println("Đã tồn tại");
			this.model.editSV(sv);{
				int soLuongDong = modelTable.getRowCount();
				for(int i=0; i<soLuongDong; i++) {
					String hoten = modelTable.getValueAt(i, 0)+"";
					String namSinh = modelTable.getValueAt(i, 2)+"";
					if((hoten.equals(sv.getHoTen() + "")) && (namSinh.equals(sv.getNamSinh()+""))) {
						modelTable.setValueAt(sv.getHoTen() + "", i, 0);
						modelTable.setValueAt(sv.getGioiTinh()+"", i, 1);
						modelTable.setValueAt(sv.getNamSinh(), i, 2);
						modelTable.setValueAt(sv.getDiaChi()+"", i, 3);
						modelTable.setValueAt(sv.getEmail()+"", i, 4);
					}
					
				}
				
			}
			
		}
	}
	
	// chọn sinh vien
	public SinhVien getSinhVien_DangChon() {
		DefaultTableModel modelTable =  (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		System.out.println(i_row);
		String hoten = modelTable.getValueAt(i_row, 0) + "";
		String ngaySinh = modelTable.getValueAt(i_row, 1) + "";
		String gioiTinh = modelTable.getValueAt(i_row, 2) + "";
		String diaChi = modelTable.getValueAt(i_row, 3) + "";
		String email = modelTable.getValueAt(i_row, 4) + "";
		
		SinhVien sVien =  new SinhVien(hoten, gioiTinh, ngaySinh, diaChi, email);
		return sVien;
	}
	
	// hien thong tin sinh vien da chon ra text
	
	public void hienThiSinhVien_daChon() {
		SinhVien sv= getSinhVien_DangChon();
		System.out.println(sv.toString());
		this.textField_name.setText(sv.getHoTen()+"");
		this.textField_namsinh.setText(sv.getNamSinh() + "");
		this.textField_gioiTinh.setText(sv.getGioiTinh()+"");
		this.textField_diaChi.setText(sv.getDiaChi()+"");
		this.textField_email.setText(sv.getEmail()+"");
		
	}
	
	public void thucHienXoa() {
		DefaultTableModel modelTable =  (DefaultTableModel) table.getModel();
		// lấy số dong table đang dược chọn
		int i_row = table.getSelectedRow();
		
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?");
		
		if(luaChon == JOptionPane.YES_NO_OPTION) {
			SinhVien sVien = getSinhVien_DangChon();
			this.model.deleteSV(sVien);
			modelTable.removeRow(i_row);
		}
	}
	
	// thuc hien them sinh vien vào mang va ca vao table
	/// add_inTable chỉ them sinh vien vao table
	public void thucHienThemSinhVien() {
		String hoTen = this.textField_name.getText() + "";
		String ngaySinhString = new String(this.textField_namsinh.getText()) + "";
		String gioiTinh = this.textField_gioiTinh.getText() + "";
		String diaChi = this.textField_diaChi.getText() + "";
		String email = this.textField_email.getText()+"";
		
		SinhVien sVien= new SinhVien(hoTen, gioiTinh, ngaySinhString, diaChi, email);
		this.add_or_editSV(sVien);
	}
	
	// lưu file
	public void saveFile(String path) {
		try {
			this.model.setTenFile(path);
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(SinhVien sv : this.model.getSinhViens()) {
				System.out.println(sv.toString());
				oos.writeObject(sv);
			}
			oos.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	public void thucHienSaveFile() {
//		if(this.model.getTenFile().length()>0) {
//			saveFile(this.model.getTenFile()+"");
//		}
//		else {
//			JFileChooser fChooser = new JFileChooser();
//			int returnVal = fChooser.showSaveDialog(this);
//			if(returnVal == JFileChooser.APPROVE_OPTION) {
//				File file = fChooser.getSelectedFile();
//				saveFile(file.getAbsolutePath()+"");
//			}
//		}
		String tenFile = "src\\Data\\SinhVien";
		saveFile(tenFile+"");
	}
	
	public void thucHienTaiDulieu() {
		while(true) {
			DefaultTableModel mTableModel = (DefaultTableModel) table.getModel();
			int soLuongDong = mTableModel.getRowCount();
			if(soLuongDong == 0) {
				break;
			}
			else {
				try {
					mTableModel.removeRow(0);
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
		}
		
		for(SinhVien sinhVien : this.model.getSinhViens()) {
			this.addSV_InTable(sinhVien);
		}
	}
	
	public void thucHienOpenFile() {
		String tenFile = "src\\Data\\SinhVien";
		
		ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
		try{
			this.model.setTenFile(tenFile);
			FileInputStream fis = new FileInputStream(tenFile);
			ObjectInputStream ois = new ObjectInputStream(fis);
			SinhVien tsVien = null;
			while((tsVien = (SinhVien) ois.readObject())!=null ){
				ds.add(tsVien);
			}
			ois.close();
			
		}catch(Exception e) {
//			System.out.println(e.getMessage());
		}
		this.model.setSinhViens(ds);
		
	}
	
	
	
	
	
	
}

