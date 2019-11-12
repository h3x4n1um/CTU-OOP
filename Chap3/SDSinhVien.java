package Chap3;

public class SDSinhVien {
	public static void main(String[] args){
		SinhVien svNam = new SinhVien();
		svNam.nhapThongTinCoBan();
		svNam.dkHocPhan();
		System.out.println(svNam+"\n");
		
		java.util.Scanner io = new java.util.Scanner(System.in);
		System.out.print("soLuongSv: ");
		int soLuongSv = io.nextInt();
		io.nextLine();
		SinhVien[] arrSv = new SinhVien[soLuongSv+5];
		for (int i = 0; i < soLuongSv; ++i){
			System.out.println("\narrSv["+i+"]");
			arrSv[i] = new SinhVien();
			arrSv[i].nhapThongTinCoBan();
			System.out.print("soLuongHp: ");
			int soLuongHp = io.nextInt();
			io.nextLine();
			for (int j = 0; j < soLuongHp; ++j) arrSv[i].dkHocPhan();
			arrSv[i].nhapDiem();
		}
		System.out.println("Danh sach sinh vien bi canh cao hoc vu:");
		for (int i = 0; i < soLuongSv; ++i){
			if (arrSv[i].diemTB() < 1.0) System.out.println(arrSv[i]+"\nDiem TB: "+arrSv[i].diemTB());
		}
		
		System.out.print("\nNhap mssv can tim: ");
		String mssv = io.nextLine();
		System.out.println("Nhung sv co mssv "+mssv+":");
		for (int i = 0; i < soLuongSv; ++i){
			if (arrSv[i].getMssv().equals(mssv)) System.out.println(arrSv[i]);
		}
	}
}
