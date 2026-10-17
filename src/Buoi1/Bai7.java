package Buoi1;

import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
	private int[] a = new int[100];
	private int n;
	
	public void setDS() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nhap so luong phan tu can nhap n = ");
		n = sc.nextInt();
		for(int i = 0; i < this.n; i++) {
			System.out.printf("a[" + i + "] = ");
			this.a[i] = sc.nextInt();
		}
	
	}
	
	public void getDS() {
		System.out.println("Hien thi danh sach: ");
		for(int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
	
	public void demSoNguyen() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nhap so nguyen x can kiem tra: ");
		int x = sc.nextInt();
		int dem = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] == x) {
				dem++;
			}
		}
		System.out.println("Co " + dem + " so nguyen " + x + " trong danh sach");
		
	}
	
	public void sapXep() {
		Arrays.sort(a, 0, n);
	}
	
	public static void main(String[] args) {
		Bai7 ds = new Bai7();
		ds.setDS();
		ds.demSoNguyen();
		ds.sapXep();
		ds.getDS();
	}

}
