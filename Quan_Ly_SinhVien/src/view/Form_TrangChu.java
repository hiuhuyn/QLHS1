package view;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import controller.ListenerTrangChu;
import view.FormBaoCao.FormBaoCao;



public class Form_TrangChu extends JFrame {
	private JFrame panelTrangChu;
	private ListenerTrangChu listenerTT;
	private JTabbedPane tabbedPane;

	private FormAddHocSinh formCN1;
	private FormLapDSLop formLapDSLop;
	private FormBaoCao formTongKet;
	private FormTraCuuHS formTraCuuHS;
	private FormBangDiemMonHoc formBangDiemMonHoc;
	private FormQuyDinh formQuyDinh;
		
	
	/**
	 * Create the panel.
	 */
	public Form_TrangChu() {
		setResizable(false);
		setTitle("Trang Chủ");
		
		setBackground(new Color(0, 210, 255));
		setBounds(100, 100, 1001, 645);
		getContentPane().setLayout(null);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 980, 30);
		getContentPane().add(menuBar);
		
		

		listenerTT = new ListenerTrangChu(this);
		JMenu nmFile = new JMenu("File");
		nmFile.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(nmFile);
		
		JMenuItem mnI_OpenFile = new JMenuItem("Open File");
		mnI_OpenFile.addActionListener(listenerTT);
		nmFile.add(mnI_OpenFile);
		
		JMenuItem mni_Save = new JMenuItem("Save");
		mni_Save.addActionListener(listenerTT);
		nmFile.add(mni_Save);
		
		JMenuItem mni_Exit = new JMenuItem("Exit");
		mni_Exit.addActionListener(listenerTT);
		nmFile.add(mni_Exit);
		
		JMenu mnGioiThieu = new JMenu("Giới thiệu");
		mnGioiThieu.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(mnGioiThieu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cách sử dụng");
		mnGioiThieu.add(mntmNewMenuItem);
		
		 tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		 tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 13));
		tabbedPane.setBounds(0, 30, 980, 576);
		getContentPane().add(tabbedPane);

		formCN1 = new FormAddHocSinh();
		tabbedPane.addTab("Tiếp nhận học sinh", formCN1);
		
		formLapDSLop = new FormLapDSLop(formCN1);
		tabbedPane.addTab("Lập danh sách lớp", formLapDSLop);
		
		formTraCuuHS = new FormTraCuuHS();
		tabbedPane.addTab("Tra cứu học sinh", formTraCuuHS);
		formBangDiemMonHoc = new FormBangDiemMonHoc();
		tabbedPane.addTab("Bảng Điểm môn học", formBangDiemMonHoc);
		
		formTongKet = new FormBaoCao();
		tabbedPane.addTab("Báo cáo", formTongKet);
		
		formQuyDinh = new FormQuyDinh();
		tabbedPane.addTab("Quy định", formQuyDinh);
	}


	public FormAddHocSinh getFormCN1() {
		return formCN1;
	}


	public void setFormCN1(FormAddHocSinh formCN1) {
		this.formCN1 = formCN1;
	}


	public FormLapDSLop getFormLapDSLop() {
		return formLapDSLop;
	}


	public void setFormLapDSLop(FormLapDSLop formLapDSLop) {
		this.formLapDSLop = formLapDSLop;
	}


	public FormBaoCao getFormTongKet() {
		return formTongKet;
	}


	public void setFormTongKet(FormBaoCao formTongKet) {
		this.formTongKet = formTongKet;
	}


	public FormTraCuuHS getFormTraCuuHS() {
		return formTraCuuHS;
	}


	public void setFormTraCuuHS(FormTraCuuHS formTraCuuHS) {
		this.formTraCuuHS = formTraCuuHS;
	}


	public FormBangDiemMonHoc getFormBangDiemMonHoc() {
		return formBangDiemMonHoc;
	}


	public void setFormBangDiemMonHoc(FormBangDiemMonHoc formBangDiemMonHoc) {
		this.formBangDiemMonHoc = formBangDiemMonHoc;
	}


	public FormQuyDinh getFormQuyDinh() {
		return formQuyDinh;
	}

	public void setFormQuyDinh(FormQuyDinh formQuyDinh) {
		this.formQuyDinh = formQuyDinh;
	}
	
	
	
	
	
}
