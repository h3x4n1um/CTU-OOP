package Chap4;

import Chap2.Diem;

public class DiemMau extends Diem {
	private String mau;
	
	public DiemMau() {
		super();
		mau = new String();
	}
	public DiemMau(int x, int y, String mau) {
		super(x, y);
		this.mau = mau;
	}
	
	public void ganMau(String mau) {
		this.mau = mau;
	}
	
	public void nhapDiem() {
		super.nhapDiem();
		java.util.Scanner io = new java.util.Scanner(System.in);
		System.out.print("Nhap mau: ");
		mau = io.nextLine();
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.println("Mau: "+mau);
	}

}
