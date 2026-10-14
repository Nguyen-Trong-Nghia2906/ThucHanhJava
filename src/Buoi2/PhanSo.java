package Buoi2;

import java.util.Scanner;

public class PhanSo {
	private int tuso, mauso;
	
	public PhanSo() {
		tuso = 0;
		mauso = 0;
	}
	
	public PhanSo(int a, int b) {
		tuso = a;
		mauso = b;
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.printf("\nTu so: ");
			tuso = sc.nextInt();
			System.out.printf("\nMau so: ");
			mauso = sc.nextInt();
			if(mauso == 0) System.out.println("Mau so phai khac 0");
		}while(mauso == 0);
	}
	
	public void hienThi() {
		if(tuso == 0) System.out.println(0);
		else if(mauso == 1) System.out.println(tuso);
		else {
			System.out.printf(tuso + "/" + mauso + "   ");
		}
	}
	
	public void nghichDao() {
		int temp = tuso;
		tuso = mauso;
		mauso = temp;
	}
	
	public PhanSo giaTriNghichDao() {
		PhanSo ps = new PhanSo();
		ps.tuso = mauso;
		ps.mauso = tuso;
		return ps;
	}
	
	public float giaTri() {
		float gt;
		gt = (float)tuso/mauso;
		return gt;
	}
	
	public boolean lonHon(PhanSo a) {
		if(this.giaTri() > a.giaTri()) return true;
		return false;
	}
	
	public PhanSo cong(PhanSo a) {
		PhanSo kq = new PhanSo();
		if(mauso == a.mauso) {
			kq.mauso = mauso;
			kq.tuso = tuso + a.tuso;
		}
		else {
			kq.mauso = mauso*a.mauso;
			kq.tuso = tuso*a.mauso + a.tuso*mauso;
		}
		return kq;
	}
	
	public PhanSo tru(PhanSo a) {
		PhanSo kq = new PhanSo();
		if(mauso == a.mauso) {
			kq.mauso = mauso;
			kq.tuso = tuso - a.tuso;
		}
		else {
			kq.mauso = mauso*a.mauso;
			kq.tuso = tuso*a.mauso + a.tuso*mauso;
		}
		return kq;
	}
	
	public PhanSo nhan(PhanSo a) {
		PhanSo kq = new PhanSo();
		kq.mauso = mauso*a.mauso;
		kq.tuso = tuso*a.tuso;

		return kq;
	}
	
	public PhanSo chia(PhanSo a) {
		PhanSo kq = new PhanSo();
		kq.mauso = mauso*a.tuso;
		kq.tuso = tuso*a.mauso;

		return kq;
	}
	
	public PhanSo cong(int a) {
		PhanSo kq = new PhanSo();
		
		kq.mauso = mauso;
		kq.tuso = tuso + a*mauso;
		
		return kq;
	}
	
	public PhanSo tru(int a) {
		PhanSo kq = new PhanSo();
		kq.mauso = mauso;
		kq.tuso = tuso - a*mauso;
		return kq;
	}
	
	public PhanSo nhan(int a) {
		PhanSo kq = new PhanSo();
		kq.mauso = mauso;
		kq.tuso = tuso*a;
		return kq;
	}
	
	public PhanSo chia(int a) {
		PhanSo kq = new PhanSo();
		kq.mauso = mauso*a;
		kq.tuso = tuso;
		return kq;
	}
	

}
