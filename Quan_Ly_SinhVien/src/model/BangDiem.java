package model;

public class BangDiem {
	private double diem_15p, diem_1tiet, diem_TBMon;
	public double getDiem_15p() {
		return diem_15p;
	}

	public void setDiem_15p(double diem_15p) {
		this.diem_15p = diem_15p;
	}

	public double getDiem_1tiet() {
		return diem_1tiet;
	}

	public void setDiem_1tiet(double diem_1tiet) {
		this.diem_1tiet = diem_1tiet;
	}

	public double getdiem_TBMon() {
		return diem_TBMon;
	}
	public void setdiem_TBMon(double diem15p, double diem1tiet) {
		this.diem_TBMon = (diem15p+diem1tiet) /3;
	}

	public BangDiem(double diem_15p, double diem_1tiet) {
		this.diem_15p = diem_15p;
		this.diem_1tiet = diem_1tiet;
	}

	public BangDiem() {
		super();
	}
	
}
