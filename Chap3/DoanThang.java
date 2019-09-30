package Chap3;

import Chap2.Diem;

public class DoanThang {
	private Diem d1;
	private Diem d2;
	
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	public DoanThang(Diem dau, Diem cuoi){
		d1 = dau;
		d2 = cuoi;
	}
	public DoanThang(int ax, int ay, int bx, int by){
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}
	
	public void nhap(){
		java.util.Scanner io = new java.util.Scanner(System.in);
		
		int ax, ay, bx, by;
		ax = io.nextInt();
		ay = io.nextInt();
		bx = io.nextInt();
		by = io.nextInt();
		
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}
	
	public void hienThi(){
		System.out.println("("+d1.giaTriX()+","+d1.giaTriY()+")"+",("+d2.giaTriX()+","+d2.giaTriY()+")");
	}
	
	public void doi(int dx, int dy){
		d1 = new Diem(d1.giaTriX() + dx, d1.giaTriY() + dy);
		d2 = new Diem(d2.giaTriX() + dx, d2.giaTriY() + dy);
	}
	
	public float doDai(){
		return d1.khoangCach(d2);
	}
	
	public boolean trung(DoanThang q){
		float sinThis = Math.abs(d1.giaTriX() - d2.giaTriX()) / doDai(),
			  sinQ = Math.abs(q.d1.giaTriX() - q.d2.giaTriX()) / q.doDai(),
			  EPSILON = (float) 1E-5;
		return (Math.abs(sinThis - sinQ) <= EPSILON) && (Math.abs(doDai() - q.doDai()) <= EPSILON);
	}
}
