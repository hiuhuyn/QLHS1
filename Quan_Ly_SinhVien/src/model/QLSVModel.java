package model;

import java.util.ArrayList;

public class QLSVModel {
	private ArrayList<SinhVien> sinhViens;
	private String tenFile;
	
	public QLSVModel() {
		this.sinhViens = new ArrayList<SinhVien>();
		this.tenFile = "";
	}
	public QLSVModel(ArrayList<SinhVien> sViens) {
		this.sinhViens = sViens;
	}
	public ArrayList<SinhVien> getSinhViens() {
		return sinhViens;
	}
	public void setSinhViens(ArrayList<SinhVien> sinhViens) {
		this.sinhViens = sinhViens;
	}

	public String getTenFile() {
		return tenFile;
	}
	public void setTenFile(String tenFile) {
		this.tenFile = tenFile;
	}

	public void insertSV(SinhVien sv) {
		this.sinhViens.add(sv);
	}
	
	public void deleteSV(SinhVien sv) {
		this.sinhViens.remove(sv);
	}
	public void editSV(SinhVien sv) {
		this.sinhViens.remove(sv);
		this.sinhViens.add(sv);
	}
	
	public SinhVien gan_SinhVien(SinhVien sv) {
		for(SinhVien sVien: sinhViens) {
			if((sVien.getHoTen().equals(sv.getHoTen())) && (sVien.getNamSinh().equals(sv.getNamSinh()))) {
				sv = sVien;
				return sv;
			}
		}
		return null;
		
	}
	
	public boolean kiemTraTonTai(SinhVien sv) {
		int i=0;
		for (SinhVien sVien : sinhViens) {
			if((sVien.getHoTen().equals(sv.getHoTen())) && (sVien.getNamSinh().equals(sv.getNamSinh()))) {
				return true;
			}
		}
		return false;
	}
}
