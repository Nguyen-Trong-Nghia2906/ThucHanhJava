package Buoi2;

import java.util.Scanner;

public class SDPhanSo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhanSo a = new PhanSo(3,7);
		PhanSo b = new PhanSo(4,9);
		a.hienThi();
		b.hienThi();
		
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		x.Nhap();
		y.Nhap();
		
		x.hienThi();
		y.hienThi();
		
		System.out.printf("\nNghich dao cua x: ");
		x.giaTriNghichDao().hienThi();
		
		System.out.printf("\nTong x + y = ");
		x.cong(y).hienThi();
		
		System.out.printf("\nNhap n: ");
		int n = sc.nextInt();
		PhanSo[] ds = new PhanSo[n];
		PhanSo tong = new PhanSo(1,1);
		PhanSo max = new PhanSo(1,1);
		PhanSo temp = new PhanSo();
		for(int i = 0; i < n; i++) {
			ds[i] = new PhanSo();
			ds[i].Nhap();
			tong = tong.cong(ds[i]);
			if(ds[i].lonHon(max)) max = ds[i];
		}
		
		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				if(ds[i].lonHon(ds[j])) {
					temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;
				}
			}
		}
		
		System.out.printf("\nTong %d phan so = ", n);
		tong.hienThi();
		
		System.out.printf("\nSo lon nhat = ");
		max.hienThi();
		
		
		System.out.println("\nDANH SACH PHAN SO:");
		for(int i = 0; i < n; i++) {
			ds[i].hienThi();
			System.out.printf("  ");
		}
		
		
	}
}
