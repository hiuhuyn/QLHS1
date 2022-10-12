package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.FormAddHocSinh;
import view.FormTraCuuHS;
import view.Form_TrangChu;

public class ListenerBM1_BM3 implements ActionListener {
	private FormAddHocSinh formBM1;
	
	private FormTraCuuHS traCuuHS;
//	private Form_TrangChu form_TrangChu;
	

	public ListenerBM1_BM3(FormAddHocSinh formCN1) {
		this.formBM1 = formCN1;
	}
	public ListenerBM1_BM3(FormTraCuuHS formTraCuuHS) {
		this.traCuuHS = formTraCuuHS;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src.equals("Reset")) {
			this.formBM1.resetForm();
			
		}
		else if(src.equals("Add")){
			try {
				this.formBM1.thucHienThemSinhVien();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}else if(src.equals("Delete")){
			this.formBM1.thucHienXoa();
		}else if(src.equals("Edit")){
			this.formBM1.hienThiSinhVien_daChon();
		}else if(src.equals("Tìm")){
			this.traCuuHS.hienThiTimKiem();
		}
//		else if(src.equals("Save File")) {
//			this.formBM1.thucHienSaveFile();
//		}else if(src.equals("Open File")) {
//			this.formBM1.thucHienOpenFile();
//			
//		}
	}
}
