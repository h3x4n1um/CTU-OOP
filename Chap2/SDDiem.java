package Chap2;

public class SDDiem {
	public static void main(String[] args) {
		Diem A = new Diem(1,2);
		A.doiDiem(1, 2);
		A.hienThi();
		
		Diem B = new Diem();
		B.nhapDiem();
		B.hienThi();
		
		Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
		C.hienThi();
		
		System.out.println(B.khoangCach());
		
		System.out.println(A.khoangCach(B));
	}
}
