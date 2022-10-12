package view.FormBaoCao;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class FormBaoCao extends JPanel {
	
	private FormBaoCaoTongKetMon formBaoCaoTongKetMon;
	private FormBaoCaoTongKetHocKi formBaoCaoTongKetHocKi;

	/**
	 * Create the panel.
	 */
	public FormBaoCao() {
		setSize(980, 500);
		setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 14));
		tabbedPane.setBounds(0, 0, 980, 500);
		add(tabbedPane);
		formBaoCaoTongKetMon = new FormBaoCaoTongKetMon();
		formBaoCaoTongKetMon.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		formBaoCaoTongKetHocKi = new FormBaoCaoTongKetHocKi();
		formBaoCaoTongKetHocKi.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		tabbedPane.addTab("Báo cáo tổng kết môn", formBaoCaoTongKetMon);
		tabbedPane.addTab("Báo cáo tổng kết học kì", formBaoCaoTongKetHocKi);
		
		

	}

}
