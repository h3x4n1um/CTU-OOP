package Chap5;

import java.io.*;

import Chap3.SinhVien;

public class ReadSinhVien {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		java.util.Scanner io = new java.util.Scanner(System.in);
		int n = io.nextInt();
		SinhVien svArr[] = new SinhVien[n+5];
		FileInputStream input = new FileInputStream("SinhVien.txt");
		for (int i = 0; i < n; ++i){
			svArr[i] = new SinhVien();
			svArr[i].readFromFile(input);
			System.out.println(svArr[i]);
		}
		input.close();
	}
}