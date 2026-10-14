package Buoi3;

import java.util.Scanner;

import Buoi2.Date;

public class SinhVien {
	private String mssv, hoten;
	private Date ngaysinh;
	private int soluonghp;
	private String[] tenhp;
	private String[] diemhp;

	public SinhVien() {
		Date ngaysinh = new Date();
	}

	public SinhVien(String ms, String ten, Date ns, int sl) {
		mssv = ms;
		hoten = ten;
		ngaysinh = ns;
		soluonghp = sl;
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("MSSV: ");
		mssv = sc.nextLine();

		System.out.printf("Ho ten: ");
		hoten = sc.nextLine();

		System.out.println("Ngay sinh: ");
		ngaysinh = new Date();
		ngaysinh.nhapNgay();

		System.out.printf("So luong hoc phan: ");
		soluonghp = sc.nextInt();
		sc.nextLine();

		tenhp = new String[soluonghp];
		diemhp = new String[soluonghp];
		for (int i = 0; i < soluonghp; i++) {
			System.out.printf("Ten hoc phan thu %d: ", i + 1);
			tenhp[i] = sc.nextLine();

			System.out.printf("Diem hoc phan " + tenhp[i] + ": ");
			diemhp[i] = sc.nextLine();
		}

	}

	public String toString() {
		String s;
		s = "MSSV " + mssv + " | Ho ten: " + hoten + " | Ngay sinh: " + ngaysinh.toString();
		s += "\nSo hoc phan: " + soluonghp;
		for (int i = 0; i < soluonghp; i++) {
			s += "\nDiem hoc phan " + tenhp[i] + ": " + diemhp[i];
		}
		return s;
	}

	public String getTen() {
		String[] ten = hoten.trim().split("\\s+");
		return ten[ten.length - 1];
	}

	public double doiDiem(String diem) {
		double d = 0;
		switch (diem) {
		case "A":
			d = 4.0;
			break;
		case "B+":
			d = 3.5;
			break;
		case "B":
			d = 3.0;
			break;
		case "C+":
			d = 2.5;
			break;
		case "C":
			d = 2.0;
			break;
		case "D+":
			d = 1.5;
			break;
		case "D":
			d = 1.0;
			break;
		case "F":
			d = 0.0;
			break;
		}
		return d;
	}

	public double diemTB() {
		double diemtb = 0;
		for (int i = 0; i < soluonghp; i++) {
			diemtb += doiDiem(diemhp[i]);
		}
		return diemtb / soluonghp;
	}

	public void dangKyHP(String tenhocphan) {
		Scanner sc = new Scanner(System.in);
		String[] hpmoi = new String[soluonghp + 1];
		String[] diemmoi = new String[soluonghp + 1];

		for (int i = 0; i < soluonghp; i++) {
			hpmoi[i] = tenhp[i];
			diemmoi[i] = diemhp[i];
		}
		hpmoi[soluonghp] = tenhocphan;

		System.out.println("Nhap diem cho hoc phan " + tenhocphan + ": ");
		diemmoi[soluonghp] = sc.nextLine();
		tenhp = hpmoi;
		diemhp = diemmoi;
		soluonghp++;
	}

	public void xoaHP(String tenhocphan) {

		String[] hpmoi = new String[soluonghp - 1];
		String[] diemmoi = new String[soluonghp - 1];

		for (int i = 0; i < soluonghp; i++) {
			if (tenhp[i].equalsIgnoreCase(tenhocphan)) {
				continue;
			}
			hpmoi[i] = tenhp[i];
			diemmoi[i] = diemhp[i];
		}
		tenhp = hpmoi;
		diemhp = diemmoi;
		soluonghp--;
	}

}
