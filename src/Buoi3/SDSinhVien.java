package Buoi3;

import java.util.Scanner;

public class SDSinhVien {
	public static void canhBaoHV(SinhVien[] ds, int n) {
		System.out.println("\nDanh sach sinh vien canh bao hoc vu:");
		for (int i = 0; i < n; i++) {
			if (ds[i].diemTB() < 2) {
				System.out.println(ds[i].toString() + " \nDiem TB: " + ds[i].diemTB());
			}
		}
	}

	public static void svTBCaoNhat(SinhVien[] ds, int n) {
		SinhVien max = ds[0];
		System.out.println("\nSinh vien diem trung binh cao nhat: ");
		for (int i = 0; i < n; i++) {
			if (ds[i].diemTB() > max.diemTB()) {
				max = ds[i];
			}
		}
		System.out.println(max.toString() + "\nDiem TB: " + max.diemTB());
	}

	public static void sapXep(SinhVien[] ds, int n) {
		SinhVien temp = new SinhVien();
		System.out.println("\nDANH SACH SINH VIEN: ");
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (ds[i].getTen().compareToIgnoreCase(ds[j].getTen()) > 0) {
					temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;
				}
			}
		}
	}

	public static void hienThiDS(SinhVien[] ds, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(ds[i].toString());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SinhVien a = new SinhVien();
		a.nhapThongTin();

		a.dangKyHP("LTHDT");
		System.out.println(a.toString());

		System.out.printf("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		sc.nextLine();
		SinhVien[] ds = new SinhVien[n];
		for (int i = 0; i < n; i++) {
			ds[i] = new SinhVien();
			ds[i].nhapThongTin();
		}

		canhBaoHV(ds, n);

		svTBCaoNhat(ds, n);

		sapXep(ds, n);

		hienThiDS(ds, n);
	}

}
