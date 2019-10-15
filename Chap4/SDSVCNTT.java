package Chap4;

public class SDSVCNTT {
	public static void main(String[] args) throws Exception{
		java.util.Scanner io = new java.util.Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = io.nextInt();
		io.nextLine();
		SinhVienCNTT[] arr = new SinhVienCNTT[n+5];
		for (int i = 0; i < n; ++i) {
			arr[i] = new SinhVienCNTT();
			System.out.println("\narr["+i+"]");
			arr[i].nhapThongTinCoBan();
			System.out.print("soLuongHp: ");
			int soLuongHp = io.nextInt();
			io.nextLine();
			for (int j = 0; j < soLuongHp; ++j) arr[i].dkHocPhan();
			arr[i].nhapDiem();
		}
		System.out.print("\nNhap email: ");
		String email = io.nextLine();
		System.out.println("\nNhung sinh vien co dia chi email "+email+" va ket qua hoc tap:");
		for (int i = 0; i < n; ++i) {
			if (email.equals(arr[i].getEmail())){
				System.out.println(arr[i]+"\nKet qua hoc tap: "+arr[i].diemTB());
			}
		}
	}

}
