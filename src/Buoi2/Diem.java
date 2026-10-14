package Buoi2;

import java.util.Scanner;

public class Diem {
	private int x, y;

	public Diem() {
		x = 0;
		y = 0;
	}

	public Diem(int a, int b) {
		x = a;
		y = b;
	}

	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Toa do x = ");
		x = sc.nextInt();
		System.out.print("Toa do y = ");
		y = sc.nextInt();
	}

	public void hienThi() {
		System.out.println("(" + x + ", " + y + ")");
	}

	public void doiDiem(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public int giaTriX() {
		return x;
	}

	public int giaTriY() {
		return y;
	}

	public float khoangCach() {
		return (float) Math.sqrt((double) x * x + (double) y * y);
	}

	public float khoangCach(Diem d) {
		float a = this.x - d.x;
		float b = this.y - d.y;
		return (float) Math.sqrt(a * a + b * b);
	}

}
