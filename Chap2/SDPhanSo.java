package Chap2;

public class SDPhanSo {
	public static void main(String[] args) {
		PhanSo a = new PhanSo(3, 7),
			   b = new PhanSo(4, 9);
		a.hienThi();
		b.hienThi();
		
		PhanSo x = new PhanSo(),
			   y = new PhanSo();
		x.nhap();
		y.nhap();
		
		x.giaTriNghichDao().hienThi();
		
		x.cong(y).hienThi();
		
		PhanSo []arr;
		PhanSo _max = new PhanSo(Integer.MIN_VALUE, 1);
		int n;
		java.util.Scanner io = new java.util.Scanner(System.in);
		n = io.nextInt();
		arr = new PhanSo[n+5];
		for (int i = 0; i < n; ++i){
			arr[i] = new PhanSo();
			arr[i].nhap();
			if (arr[i].lonHon(_max)) _max = arr[i].giaTriNghichDao().giaTriNghichDao();
		}
		_max.hienThi();
	}

}
