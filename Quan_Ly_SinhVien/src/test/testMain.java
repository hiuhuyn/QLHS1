package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;

import view.Form_TrangChu;
import view.ViewJFrame_Login;

public class testMain {
	public static void main(String[] args) {
		try {
			 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			testLogin();
			
//			testTrangChu();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void testLogin() {
		ViewJFrame_Login frame = new ViewJFrame_Login();
		frame.setVisible(true);
		
		
	}
	public static void testTrangChu() {
		Form_TrangChu frame = new Form_TrangChu();
		frame.setVisible(true);
		
	}
			
						
		
}
