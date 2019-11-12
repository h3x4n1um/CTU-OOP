package Chap5;

import java.io.*;

import Chap3.SinhVien;

public class WriteSinhVien {
	public static void main(String[] args) throws IOException {
		java.util.Scanner io = new java.util.Scanner(System.in);
		int n = io.nextInt();
		SinhVien svArr[] = new SinhVien[n+5];
		FileOutputStream output = new FileOutputStream("SinhVien.txt");
		for (int i = 0; i < n; ++i){
			svArr[i] = new SinhVien();
			svArr[i].nhapThongTinCoBan();
			svArr[i].writeToFile(output);
			output.flush();
		}
		output.close();
	}
}
