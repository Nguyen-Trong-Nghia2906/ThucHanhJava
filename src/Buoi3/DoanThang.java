package Buoi3;

import java.util.Scanner;

import Buoi2.Diem;

public class DoanThang {
	private Diem d1, d2;

	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}

	public DoanThang(Diem a, Diem b) {
		d1 = a;
		d2 = b;
	}

	public DoanThang(int ax, int ay, int bx, int by) {
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}

	public void nhapToaDo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap toa do diem A: ");
		d1.nhapDiem();

		System.out.println("Nhap toa do diem B: ");
		d2.nhapDiem();
	}

	public void hienThi() {
		d1.hienThi();
		d2.hienThi();
	}

	public void tinhTien(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}

	public double doDai() {
		double dx = d1.giaTriX() - d2.giaTriX();
		double dy = d1.giaTriY() - d2.giaTriY();

		return Math.sqrt(dx * dx + dy * dy);
	}
}
