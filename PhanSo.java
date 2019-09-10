package Homework;

public class PhanSo {
	private int tuSo;
	private int mauSo;
	
	PhanSo(){
		tuSo = 0;
		mauSo = 0;
	}
	PhanSo(int tu, int mau){
		tuSo = tu;
		mauSo = mau;
	}
	
	public void nhap(){
		java.util.Scanner io = new java.util.Scanner(System.in);
		tuSo = io.nextInt();
		do{
			mauSo = io.nextInt();
			if (mauSo == 0) System.out.println("Error: mauSo = 0");
		}while(mauSo == 0);
	}
	
	public PhanSo prettify(){
		PhanSo res = new PhanSo(this.tuSo, this.mauSo);
		
		int a = java.lang.Math.abs(res.tuSo),
			b = java.lang.Math.abs(res.mauSo);
		while(b > 0){
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		res.tuSo /= a;
		res.mauSo /= a;
		
		int cmp = 0;
		if (res.tuSo < 0) cmp += 0b10;
		if (res.mauSo < 0) cmp += 0b1;
		if (cmp == 0b1 || cmp == 0b11){
			res.tuSo -= res.tuSo;
			res.mauSo -= res.mauSo;
		}
		return res;
	}
	
	public void hienThi(){
		PhanSo tmp = new PhanSo(prettify().tuSo, prettify().mauSo);
		if (tmp.tuSo == 0 || tmp.mauSo == 1) System.out.println(tmp.tuSo);
		else System.out.println(tmp.tuSo+"/"+tmp.mauSo);
	}
	
	public void nghichDao(){
		int tmp = tuSo;
		tuSo = mauSo;
		mauSo = tmp;
	}
	
	public PhanSo giaTriNghichDao(){
		return new PhanSo(mauSo, tuSo);
	}
	
	public double giaTriThuc(){
		return (double) tuSo / mauSo;
	}
	
	public boolean lonHon(PhanSo a){
		return (tuSo*a.mauSo > a.tuSo*mauSo);
	}
	
	public PhanSo cong(PhanSo a){
		return new PhanSo(tuSo*a.mauSo + a.tuSo*mauSo, mauSo*a.mauSo);
	}
	
	public PhanSo cong(int a){
		return cong(new PhanSo(a, 1));
	}
}
