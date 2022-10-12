package model;

import java.util.ArrayList;
import java.util.Iterator;

public class QLlopModel {
	
	private ArrayList<Lop> lops;
	private String tenFile;
	
	
	public String getTenFile() {
		return tenFile;
	}

	public void setTenFile(String tenFile) {
		this.tenFile = tenFile;
	}
	

	public ArrayList<Lop> getLops() {
		return lops;
	}

	public void setLops(ArrayList<Lop> lops) {
		this.lops = lops;
	}

	/**
	 * @param lops
	 */
	public QLlopModel(ArrayList<Lop> lops) {
		super();
		this.lops = lops;
	}
	public QLlopModel() {
		lops = new ArrayList<Lop>();
	}
	
	public void insertLop(Lop lop) {
		this.lops.add(lop);
	}
	public void xoaLop(Lop lop) {
		this.lops.remove(lop);
	}
	public void updateLop(Lop lop) {
		this.lops.remove(lop);
		this.lops.add(lop);
		
	}
	
	public boolean kiemTra_Lop_tonTai(Lop lop) {
		for (Lop l : this.lops) {
			if(l.getTenLop().equals(lop.getTenLop())) {
				
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
