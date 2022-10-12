package model;

public class Mon {
	
	private double toan, ly, hoa, sinh, su, dia, gdcd, theChat, van;
	private double diemTB_hocKi;
	private BangDiem bangDiem;
	
	
	/**
	 * 
	 */
	public Mon() {
		super();
	}



	public double getToan() {
		return toan;
	}


	public void setToan(double diem15, double diem1tiet) {
		bangDiem.setdiem_TBMon(diem15, diem1tiet);
		this.toan = bangDiem.getdiem_TBMon();
	}


	public double getLy() {
		
		return ly;
	}


	public void setLy(double diem15, double diem1tiet) {
		bangDiem.setdiem_TBMon(diem15, diem1tiet);
		this.ly = bangDiem.getdiem_TBMon();
	}


	public double getHoa() {
		
		return hoa;
	}


	public void setHoa(double diem15, double diem1tiet) {
		bangDiem.setdiem_TBMon(diem15, diem1tiet);
		this.hoa = bangDiem.getdiem_TBMon();
	}


	public double getSinh() {
		
		return sinh;
	}


	public void setSinh(double diem15, double diem1tiet) {
		bangDiem.setdiem_TBMon(diem15, diem1tiet);
		this.sinh = bangDiem.getdiem_TBMon();
	}


	public double getSu() {
		
		return su;
	}


	public void setSu(double diem15, double diem1tiet) {
		bangDiem.setdiem_TBMon(diem15, diem1tiet);
		this.su = bangDiem.getdiem_TBMon();
	}


	public double getDia() {
		
		return dia;
	}


	public void setDia(double diem15, double diem1tiet) {
		bangDiem.setdiem_TBMon(diem15, diem1tiet);
		this.dia = bangDiem.getdiem_TBMon();
	}


	public double getGdcd() {
		
		return gdcd;
	}


	public void setGdcd(double diem15, double diem1tiet) {
		bangDiem.setdiem_TBMon(diem15, diem1tiet);
		this.gdcd = bangDiem.getdiem_TBMon();
	}


	public double getTheChat() {
		
		return theChat;
	}


	public void setTheChat(double diem15, double diem1tiet) {
		bangDiem.setdiem_TBMon(diem15, diem1tiet);
		this.theChat = bangDiem.getdiem_TBMon();
	}


	public double getVan() {
		
		return van;
	}


	public void setVan(double diem15, double diem1tiet) {
		bangDiem.setdiem_TBMon(diem15, diem1tiet);
		this.van = bangDiem.getdiem_TBMon();
	}

	public BangDiem getBangDiem() {
		return bangDiem;
	}

	public void setBangDiem(BangDiem bangDiem) {
		this.bangDiem = bangDiem;
	}

	public double getDiemTB_hocKi() {
		this.diemTB_hocKi = (double)(toan + ly + van + su + dia + hoa + gdcd + theChat + sinh)/9;
		return diemTB_hocKi;
	}
	
	
	

	

	








	
}
