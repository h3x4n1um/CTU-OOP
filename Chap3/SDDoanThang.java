package Chap3;

import Chap2.Diem;

public class SDDoanThang {
	public static void main(String[] args) {
		Diem A = new Diem(2, 1),
		     B = new Diem(5, 3);
		DoanThang AB = new DoanThang(A, B),
				  CD = new DoanThang();
		AB.doi(1, 2);
		AB.hienThi();
		CD.nhap();
		System.out.println(AB.trung(CD) + "\n" + CD.doDai());
	}
}
