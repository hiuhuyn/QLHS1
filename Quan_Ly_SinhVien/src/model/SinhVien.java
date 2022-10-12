package model;

import java.io.Serializable;

/**
 * @author minhq
 *
 */
public class SinhVien implements Serializable{
	

	private String  hoTen, diaChi, email, gioiTinh;
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}

	private String namSinh, lop;
	private double diem_TBHK1, diem_TBHK2;

	public SinhVien(String hoTen,String gioiTinh,  String namSinh,String diaChi, String email ) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.namSinh = namSinh;
		this.email = email;
		this.gioiTinh = gioiTinh;
		this.diem_TBHK1 = 0;
		this.diem_TBHK2 = 0;
		this.lop = "";
	}
	public SinhVien() {
		super();
	}
	
	
	/**
	 * @param hoTen
	 * @param diaChi
	 * @param email
	 */
	public SinhVien(String tenLop, String hoTen, String diaChi, String email) {
		super();
		this.lop = tenLop;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.email = email;
	}
	public double getDiem_TBHK1() {
		return diem_TBHK1;
	}
	public void setDiem_TBHK1(Mon mon) {
		this.diem_TBHK1 = mon.getDiemTB_hocKi();
	}
	public double getDiem_TBHK2() {
		return diem_TBHK2;
	}
	public void setDiem_TBHK2(Mon mon) {
		this.diem_TBHK2 = mon.getDiemTB_hocKi();
	}
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	@Override
	public String toString() {
		return "SinhVien [hoTen=" + hoTen + ", diaChi=" + diaChi + ", email=" + email + ", gioiTinh=" + gioiTinh
				+ ", namSinh=" + namSinh + ", lop=" + lop + ", diem_TBHK1=" + diem_TBHK1 + ", diem_TBHK2=" + diem_TBHK2
				+ "]";
	}
	
}
