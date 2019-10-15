package Chap3;

import java.util.Date;
import java.text.SimpleDateFormat;

public class SinhVien {
	private String mssv;
	private String hoTen;
	private Date ngaySinh;
	private int soLuongHocPhan;
	private String[] hocPhan;
	private String[] diem;
	
	public SinhVien() {
		mssv = new String();
		hoTen = new String();
		ngaySinh = new Date();
		soLuongHocPhan = 0;
		hocPhan = new String[105];
		diem = new String[105];
		for (int i = 0; i < 105; ++i){
			hocPhan[i] = new String();
			diem[i] = new String();
		}
	}

	public void nhapThongTinCoBan() throws Exception {
		java.util.Scanner io = new java.util.Scanner(System.in);
		System.out.print("mssv: ");
		mssv = io.nextLine();
		System.out.print("hoTen: ");
		hoTen = io.nextLine();
		System.out.print("ngaySinh (dd/MM/yyyy): ");
		String sDate = io.nextLine();
		ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
		/*System.out.print("soLuongHocPhan: ");
		soLuongHocPhan = io.nextInt();
		io.nextLine();
		for (int i = 0; i < soLuongHocPhan; ++i){
			System.out.print("hocPhan["+i+"]: ");
			hocPhan[i] = io.nextLine();
		}*/
	}
	
	public void dkHocPhan(){
		java.util.Scanner io = new java.util.Scanner(System.in);
		System.out.print("hocPhan["+soLuongHocPhan+"]: ");
		hocPhan[soLuongHocPhan] = io.nextLine();
		++soLuongHocPhan;
	}
	
	public void nhapDiem(){
		java.util.Scanner io = new java.util.Scanner(System.in);
		for (int i = 0; i < soLuongHocPhan; ++i){
			System.out.print("Diem hoc phan \""+hocPhan[i]+"\": ");
			diem[i] = io.nextLine();
		}
	}
	
	public String toString(){
		return "\nMssv: "+mssv+
			   "\nHo ten: "+hoTen+
			   "\nNgay sinh: "+ngaySinh;
	}
	
	public float diemTB(){
		float res = 0;
		for (int i = 0; i < soLuongHocPhan; ++i){
			switch(diem[i]){
			case "A":
				res += 4;
				break;
			case "B+":
				res += 3.5;
				break;
			case "B":
				res += 3;
				break;
			case "C+":
				res += 2.5;
				break;
			case "C":
				res += 2.0;
				break;
			case "D+":
				res += 1.5;
				break;
			case "D":
				res += 1.0;
				break;
			default:
			}
		}
		return res / soLuongHocPhan;
	}
	
	public String getMssv(){
		return mssv;
	}
}
