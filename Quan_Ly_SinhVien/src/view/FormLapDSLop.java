package view;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.ListenerBM2;
import model.Lop;
import model.QLSVModel;
import model.QLlopModel;
import model.SinhVien;

import javax.swing.JComboBox;
import java.awt.Panel;
import java.awt.ScrollPane;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import java.awt.Scrollbar;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class FormLapDSLop extends JPanel {
	private JTextField textField_TenLop;
	private JTextField textField_SiSo;
	private JTable table;
	private JTextField textField_hoten;
	private JTextField textField_ngaySinh;
	private QLlopModel qLlopModel;
	private QLSVModel qlsvModel;
	private FormAddHocSinh formBm1;

	

	/**
	 * Create the panel.
	 */
	public FormLapDSLop(FormAddHocSinh formBm1) {
		
		
		
		
		// tai du lieu
		formBm1.thucHienOpenFile();
		this.qlsvModel = formBm1.getQlsvModel();
		System.out.println("Tao va tai du lieu co qlsv sau: "+qlsvModel.toString());
		this.formBm1 = formBm1;
		
		setLayout(null);
		qLlopModel = new QLlopModel();
//		qlsvModel = new QLSVModel();
		
		ListenerBM2 listenerBM2 = new ListenerBM2(this);
		
		JPanel panel_ThaoTac = new JPanel();
		panel_ThaoTac.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_ThaoTac.setBounds(10, 56, 934, 65);
		add(panel_ThaoTac);
		panel_ThaoTac.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Lớp");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(42, 17, 66, 30);
		panel_ThaoTac.add(lblNewLabel_2);
		
		textField_TenLop = new JTextField();
		textField_TenLop.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_TenLop.setBackground(new Color(255, 255, 255));
		textField_TenLop.setForeground(new Color(0, 0, 0));
		textField_TenLop.setBounds(110, 17, 160, 30);
		panel_ThaoTac.add(textField_TenLop);
		textField_TenLop.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Sĩ số");
		lblNewLabel_2_1.setBounds(294, 17, 67, 30);
		panel_ThaoTac.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		textField_SiSo = new JTextField();
		textField_SiSo.setBounds(360, 18, 160, 30);
		panel_ThaoTac.add(textField_SiSo);
		textField_SiSo.setForeground(new Color(0, 0, 0));
		textField_SiSo.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_SiSo.setColumns(10);
		textField_SiSo.setBackground(Color.WHITE);
		
		JButton btnTaoLop = new JButton("Tạo Lớp");
		btnTaoLop.addActionListener(listenerBM2);
		btnTaoLop.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTaoLop.setBackground(new Color(0, 204, 255));
		btnTaoLop.setBounds(571, 18, 195, 31);
		panel_ThaoTac.add(btnTaoLop);
		
		JButton btnTimLop = new JButton("Tìm lớp");
		btnTimLop.addActionListener(listenerBM2);
		btnTimLop.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTimLop.setBackground(new Color(0, 204, 255));
		btnTimLop.setBounds(788, 18, 136, 31);
		panel_ThaoTac.add(btnTimLop);
		
		
		JPanel panel_themSVvaoLop = new JPanel();
		panel_themSVvaoLop.setLayout(null);
		panel_themSVvaoLop.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_themSVvaoLop.setBounds(0, 0, 954, 36);
		add(panel_themSVvaoLop);
		
		JLabel lblNewLabel = new JLabel("BM2");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel_themSVvaoLop.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Danh sách lớp");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(409, 10, 103, 17);
		panel_themSVvaoLop.add(lblNewLabel_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Stt", "H\u1ECD v\u00E0 T\u00EAn", "Gi\u1EDBi t\u00EDnh", "\u0110\u1ECBa ch\u1EC9"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(150);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(134);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(189);
		table.setRowHeight(25);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setLocation(10, 201);
		scrollPane.setSize(933, 266);
		
		scrollPane.setViewportView(table);
		
		
		add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 132, 934, 58);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("Tên học sinh");
		lblNewLabel_2_2.setBounds(10, 9, 91, 39);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(lblNewLabel_2_2);
		
		textField_hoten = new JTextField();
		textField_hoten.setForeground(Color.BLACK);
		textField_hoten.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_hoten.setColumns(10);
		textField_hoten.setBackground(Color.WHITE);
		textField_hoten.setBounds(111, 13, 160, 30);
		panel.add(textField_hoten);
		
		JButton btnThmVoLp = new JButton("Thêm vào lớp");
		btnThmVoLp.addActionListener(listenerBM2);
		btnThmVoLp.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnThmVoLp.setBackground(new Color(0, 204, 255));
		btnThmVoLp.setBounds(572, 9, 195, 39);
		panel.add(btnThmVoLp);
		
		JButton btnXaHcSinh = new JButton("Xóa học sinh");
		btnXaHcSinh.addActionListener(listenerBM2);
		btnXaHcSinh.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnXaHcSinh.setBackground(new Color(0, 204, 255));
		btnXaHcSinh.setBounds(789, 9, 135, 39);
		panel.add(btnXaHcSinh);
		
		textField_ngaySinh = new JTextField();
		textField_ngaySinh.setForeground(Color.BLACK);
		textField_ngaySinh.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_ngaySinh.setColumns(10);
		textField_ngaySinh.setBackground(Color.WHITE);
		textField_ngaySinh.setBounds(359, 13, 107, 30);
		panel.add(textField_ngaySinh);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Ngày sinh");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_2_1.setBounds(281, 9, 68, 39);
		panel.add(lblNewLabel_2_2_1);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(listenerBM2);
		btnSave.setBounds(649, 478, 100, 39);
		add(btnSave);
		btnSave.setBackground(new Color(0, 204, 255));
		
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(listenerBM2);
		btnCancel.setBounds(802, 478, 100, 39);
		add(btnCancel);
		btnCancel.setBackground(new Color(0, 204, 255));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 13));
	
	}
	
	
	
	public QLlopModel getqLlopModel() {
		return qLlopModel;
	}


	public void setqLlopModel(QLlopModel qLlopModel) {
		this.qLlopModel = qLlopModel;
	}

	
	
	public void taoLop(Lop lop) {
		if(this.qLlopModel.kiemTra_Lop_tonTai(lop)) {
			JOptionPane.showMessageDialog(this, "Lớp đã tồn tại!!");
		}else {
			System.out.println("Da tao lop!!");
			this.qLlopModel.insertLop(lop);
		}
	}
	
	public void thucHienTaoLop() {
		int siSo = Integer.valueOf(textField_SiSo.getText());
		String tenLop = textField_TenLop.getText();
		Lop lop = new Lop(tenLop, siSo);
		this.taoLop(lop);
		
	}
	
	public void thucHien_timLop() {
		
		
	}
	
	public void themSinhVienVaoLop(Lop lop, SinhVien sv) {
		
		
		if(this.qLlopModel.kiemTra_Lop_tonTai(lop)) {
			if(lop.kiemTra_SV_TonTai_inLop(sv)) {
				JOptionPane.showMessageDialog(this, "Sinh viên đã tồn tại!!");
			}else {
				sv.setLop(lop.getTenLop());
				lop.insertSV(sv);
			}
			this.qLlopModel.updateLop(lop);
			this.addSV_InTable(sv);
		}else {
			int luachon = JOptionPane.showConfirmDialog(this, "Lớp chưa tồn tại, bạn có muốn tạo lớp không?");
			if(luachon== JOptionPane.YES_NO_OPTION) {
				this.thucHienTaoLop();
			}
		}
	}
	
	public void thucHienThemSVvaoLop() {
		int siSo = Integer.valueOf(textField_SiSo.getText());
		String tenLop = textField_TenLop.getText();
		Lop lop = new Lop(tenLop, siSo);
		
		String hotenSV = textField_hoten.getText();
		String namSinh = textField_ngaySinh.getText();
		SinhVien sv = new SinhVien();
		sv.setHoTen(hotenSV);
		sv.setNamSinh(namSinh);
		if(this.qlsvModel.kiemTraTonTai(sv)){
			sv = qlsvModel.gan_SinhVien(sv);
			System.out.println("Sinh vien them vao: " + sv.toString());
			
			this.themSinhVienVaoLop(lop, sv);
		}
		
		else {
			JOptionPane.showMessageDialog(this, "Sinh viên không tồn tại!!");
		}
	}
	
	public void addSV_InTable(SinhVien sv) {	
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = model_table.getRowCount();
		model_table.addRow(new Object[] {
				i_row++,
				sv.getHoTen() + "",
				sv.getGioiTinh() + "",
				sv.getDiaChi() + "",
		});
	}
	public void hienTTLop() {
		
	}
	
	public void saveFile_Lop() {
		String path = "src\\Data\\Lop";
		
		try {
			this.qLlopModel.setTenFile(path);
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(Lop lop : this.qLlopModel.getLops()) {
//				System.out.println(lop.toString());
				oos.writeObject(lop);
			}
			oos.close();
			
		}catch (Exception e) {
//			e.printStackTrace();
			// TODO: handle exception
		}
	}
	public void openFile_lop() {
		String path = "src\\Data\\Lop";
		ArrayList<Lop> dsLops = new ArrayList<Lop>();
		
		try {
			this.qLlopModel.setTenFile(path);
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Lop l = null;
			while((l = (Lop) ois.readObject())!=null) {
				
				dsLops.add(l);
			}
			ois.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		this.qLlopModel.setLops(dsLops);
		
		for(Lop t: qLlopModel.getLops()) {
			System.out.println(t.toString());
		}
	}
	// chọn sinh vien
	public SinhVien getSinhVien_DangChon() {
		DefaultTableModel modelTable =  (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int stt = Integer.valueOf(i_row);
		String hoten = modelTable.getValueAt(i_row, 1) + "";
		String diaChi = modelTable.getValueAt(i_row, 2) + "";
		String email = modelTable.getValueAt(i_row, 3) + "";
		String tenLop = textField_TenLop.getText();
		SinhVien sVien =  new SinhVien(tenLop,hoten, diaChi, email);
		sVien = qlsvModel.gan_SinhVien(sVien);
		return sVien;
	}
	
	public void hienThiSinhVienDaChon() {
		SinhVien sVien = getSinhVien_DangChon();
		this.textField_hoten.setText(sVien.getHoTen());
		this.textField_ngaySinh.setText(sVien.getNamSinh());
		this.textField_TenLop.setText(sVien.getLop());
	}
	
	
	
	public void thucHienXoaSV_khoiLop() {
		
		DefaultTableModel mTableModel = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		hienThiSinhVienDaChon();
		ArrayList<SinhVien> dSinhViens = new ArrayList<SinhVien>();
		
		int siSo = Integer.valueOf(textField_SiSo.getText());
		
		Lop lop = new Lop(textField_TenLop.getText(), siSo);
		
		int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa học sinh này khỏi lớp không?");
		
		if(luaChon == JOptionPane.YES_NO_OPTION) {
			SinhVien sVien = getSinhVien_DangChon();
			if(sVien.getLop().equals(lop.getTenLop())) {
				lop.deleteSV(sVien);
				mTableModel.removeRow(i_row);
				this.qLlopModel.updateLop(lop);
			}
			
			
		}
	}
	
	
	
	
	
}
