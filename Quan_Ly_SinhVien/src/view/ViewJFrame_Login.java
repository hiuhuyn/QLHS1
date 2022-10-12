package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ListenerDangNhap;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ViewJFrame_Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField_TaiKhoan;
	private JPasswordField passwordField_Pass;

	
	public ViewJFrame_Login() {
		setTitle("Đăng nhập");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 309, 195);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		
		ListenerDangNhap listenerDangNhap = new ListenerDangNhap(this);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tài khoản");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(40, 61, 101, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu");
		lblMtKhu.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMtKhu.setBounds(40, 86, 101, 14);
		contentPane.add(lblMtKhu);
		
		textField_TaiKhoan = new JTextField();
		textField_TaiKhoan.setBounds(121, 60, 128, 20);
		contentPane.add(textField_TaiKhoan);
		textField_TaiKhoan.setColumns(10);
		
		passwordField_Pass = new JPasswordField();
		passwordField_Pass.setBounds(121, 86, 128, 20);
		contentPane.add(passwordField_Pass);
		
		JButton button_login = new JButton("Login");
		button_login.setBackground(new Color(128, 255, 128));
		button_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_login.setBounds(40, 117, 89, 23);
		button_login.addActionListener(listenerDangNhap);
		
		contentPane.add(button_login);
		
		JButton button_exit = new JButton("Exit");
		button_exit.setBackground(new Color(128, 255, 128));
		button_exit.setBounds(160, 117, 89, 23);
		button_exit.addActionListener(listenerDangNhap);
		contentPane.add(button_exit);
		
		JLabel lblNewLabel_1 = new JLabel("Đăng Nhập");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(80, 0, 169, 50);
		contentPane.add(lblNewLabel_1);
		
	}
	
	
	
	public boolean kiemTraDangNhap() {
		String user = "admin";
		String pass = "1234";
		
		String userInput = this.textField_TaiKhoan.getText();
		String passInput = new String(this.passwordField_Pass.getPassword());
		if(userInput.equals(user) && passInput.equals(pass)) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
