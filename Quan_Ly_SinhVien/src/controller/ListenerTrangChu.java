package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.*;
import view.FormBaoCao.FormBaoCao;

public class ListenerTrangChu implements ActionListener {
	private Form_TrangChu form_TrangChu;
//	private FormAddHocSinh formBM1;
//	private FormLapDSLop formBM2;
//	private FormTraCuuHS formBM3;
//	private FormBangDiemMonHoc formBM4;
//	private FormBaoCao formBM5;
//	private FormQuyDinh formBM6;
	
	public ListenerTrangChu(Form_TrangChu form_TrangChu) {
		super();
		this.form_TrangChu = form_TrangChu;
	}
	
	/**
	 * @param form_TrangChu
	 * @param formBM1
	 * @param formBM2
	 * @param formBM3
	 * @param formBM4
	 * @param formBM5
	 * @param formBM6
	 */
//	public ListenerTrangChu(Form_TrangChu form_TrangChu, FormAddHocSinh formBM1, FormLapDSLop formBM2,
//			FormTraCuuHS formBM3, FormBangDiemMonHoc formBM4, FormBaoCao formBM5, FormQuyDinh formBM6) {
//		super();
//		this.form_TrangChu = form_TrangChu;
//		this.formBM1 = formBM1;
//		this.formBM2 = formBM2;
//		this.formBM3 = formBM3;
//		this.formBM4 = formBM4;
//		this.formBM5 = formBM5;
//		this.formBM6 = formBM6;
//	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if(src.equals("Save")) {
			form_TrangChu.getFormCN1().thucHienSaveFile();
			form_TrangChu.getFormLapDSLop().saveFile_Lop();
			
		}else if(src.equals("Exit")) {
			System.exit(0);
		}else if(src.equals("Open File")) {
			form_TrangChu.getFormCN1().thucHienOpenFile();
			form_TrangChu.getFormCN1().thucHienTaiDulieu();
			form_TrangChu.getFormLapDSLop().openFile_lop();
		}
	}


}
