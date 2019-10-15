package Chap4;

import Chap2.Diem;

public class SDDiemMau {
	public static void main(String[] args) {
		DiemMau A = new DiemMau(5, 10, "trang");
		A.hienThi();
		System.out.println();
		
		DiemMau B = new DiemMau();
		B.nhapDiem();
		B.doiDiem(10, 8);
		B.hienThi();
		
		java.util.Scanner io = new java.util.Scanner(System.in);
		System.out.print("\nNhap n: ");
		int n = io.nextInt();
		Diem[] arr = new Diem[n+5];
		for (int i = 0; i < n; ++i) {
			System.out.println();
			int type = 0;
			do {
				System.out.print("arr["+i+"] type: ");
				type = io.nextInt();
			} while(type != 1 && type != 2);
			if (type == 1) {
				arr[i] = new Diem();
				System.out.println("Diem arr["+i+"]");
				arr[i].nhapDiem();
			}
			else {
				arr[i] = new DiemMau();
				System.out.println("DiemMau arr["+i+"]");
				arr[i].nhapDiem();
			}
		}
		System.out.println();
		for (int i = 0; i < n; ++i) {
			arr[i].hienThi();
		}
	}
}
