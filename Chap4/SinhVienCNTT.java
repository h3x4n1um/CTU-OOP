package Chap4;

import Chap3.SinhVien;

public class SinhVienCNTT extends SinhVien{
	private String taikhoan;
	private String matkhau;
	private String email;
	
	public SinhVienCNTT() {
		super();
		taikhoan = new String();
		matkhau = new String();
		email = new String();
	}
	
	public void nhapThongTinCoBan() throws Exception{
		super.nhapThongTinCoBan();
		java.util.Scanner io = new java.util.Scanner(System.in);
		System.out.print("taikhoan: ");
		taikhoan = io.nextLine();
		System.out.print("matkhau: ");
		matkhau = io.nextLine();
		System.out.print("email: ");
		email = io.nextLine();
	}
	
	public void doiMatKhau(String newpass) {
		matkhau = newpass;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return super.toString()+
			   "\nTai khoan: "+taikhoan+
			   "\nMat khau: "+matkhau+
			   "\nEmail: "+email;
	}

}
