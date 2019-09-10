package Homework;

public class Diem {
	private int x;
	private int y;
	
	Diem(){
		x = 0;
		y = 0;
	}
	Diem(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void nhapDiem(){
		java.util.Scanner io = new java.util.Scanner(System.in);
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
