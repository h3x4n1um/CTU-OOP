package Chap2;

public class Diem {
	private int x;
	private int y;
	
	public Diem(){
		x = 0;
		y = 0;
	}
	public Diem(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void nhapDiem(){
		java.util.Scanner io = new java.util.Scanner(System.in);
		System.out.print("Nhap Diem: ");
		x = io.nextInt();
		y = io.nextInt();
	}
	
	public void hienThi(){
		System.out.println("("+x+","+y+")");
	}
	
	public void doiDiem(int dx, int dy){
		x += dx;
		y += dy;
	}
	
	public int giaTriX(){
		return x;
	}
	
	public int giaTriY(){
		return y;
	}
	
	public float khoangCach(){
		return (float) java.lang.Math.sqrt(x*x + y*y);
	}
	
	public float khoangCach(Diem d){
		return new Diem(x-d.x, y-d.y).khoangCach();
	}
}
