package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.FormLapDSLop;

public class ListenerBM2 implements ActionListener{
	
	private FormLapDSLop formLapDSLop;
	

	/**
	 * @param formLapDSLop
	 */
	public ListenerBM2(FormLapDSLop formLapDSLop) {
		this.formLapDSLop = formLapDSLop;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src.equals("Tạo Lớp")) {
			this.formLapDSLop.thucHienTaoLop();
		}else if(src.equals("Thêm vào lớp")) {
			this.formLapDSLop.thucHienThemSVvaoLop();
		}else if(src.equals("Xóa học sinh")) {
			this.formLapDSLop.thucHienXoaSV_khoiLop();
		}else if(src.equals("Tìm")) {
			
		}
	}

}
