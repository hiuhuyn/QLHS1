package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Lop implements Serializable {
	@Override
	public String toString() {
		return "Lop [tenLop=" + tenLop + ", siSo=" + siSo + ", arrSinhViens=" + arrSinhViens + "]";
	}

	private String tenLop;
	private int siSo;
	private ArrayList<SinhVien> arrSinhViens;
	public String getTenLop() {
		return tenLop;
	}
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	public int getSiSo() {
		return siSo;
	}
	public void setSiSo(int siSo) {
		this.siSo = siSo;
	}
	public Lop(String tenLop, int siSo, ArrayList<SinhVien> sv) {
		this.tenLop = tenLop;
		this.siSo = siSo;
		this.arrSinhViens = sv;
	}
	public Lop(String tenLop, int siSo) {
		this.tenLop = tenLop;
		this.siSo = siSo;
		arrSinhViens = new ArrayList<SinhVien>();
	}
	public Lop() {
		super();
	}
	
	public void insertSV(SinhVien sv) {
		this.arrSinhViens.add(sv);
	}
	
	public void updateSV(SinhVien sv) {
		arrSinhViens.remove(sv);
		arrSinhViens.add(sv);
	}
	public void deleteSV(SinhVien sv) {
		arrSinhViens.remove(sv);
	}
	
	public boolean kiemTra_SV_TonTai_inLop(SinhVien sv) {
		for (SinhVien sVien : arrSinhViens) {
			if((sVien.getHoTen().equals(sv.getHoTen())) && (sVien.getNamSinh().equals(sv.getNamSinh()))) {
				return true;
			}
		}
		return false;
	}
	
}
