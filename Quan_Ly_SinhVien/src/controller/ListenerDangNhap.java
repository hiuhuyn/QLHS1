package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import view.ViewJFrame_Login;

import view.Form_TrangChu;

public class ListenerDangNhap implements ActionListener{
	
	private ViewJFrame_Login loginView;
	private Form_TrangChu fromTrangChu;
	
	
	

	public ListenerDangNhap(ViewJFrame_Login loginView) {
		this.loginView = loginView;
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cm = e.getActionCommand();
		if(cm.equals("Login")) {
			if(this.loginView.kiemTraDangNhap()) {
				JOptionPane.showMessageDialog(loginView, "Bạn đã đăng nhập thành công");
				fromTrangChu = new Form_TrangChu();
				fromTrangChu.setVisible(true);
				loginView.dispose();
				

				

				
			}
			else {
				JOptionPane.showMessageDialog(loginView, "Tài khoản hoặc mật khẩu không chính xác");
			}
		}else if (cm.equals("Exit")) {
			System.exit(0);
		}
	}

}
