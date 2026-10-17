package Buoi3;

import java.util.Scanner;

public class Gach {
	private String maso, mau;
	private int sl, dai, ngang;
	private long gia;
	
	public Gach() {
		
	}
	
	public Gach(String maso, String mau, int sl, int dai, int ngang, long gia) {
		this.maso = maso;
		this.mau = mau;
		this.sl = sl;
		this.dai = dai;
		this.ngang = ngang;
		this.gia = gia;
	}
	
	public Gach makeCopy(Gach g) {
		Gach t = new Gach();
		t.maso = g.maso;
		t.mau = g.mau;
		t.sl = g.sl;
		t.dai = g.dai;
		t.ngang = g.ngang;
		t.gia = g.gia;
		
		return t;
		
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so: ");
		maso = sc.nextLine();
		
		System.out.print("Nhap mau: ");
		mau = sc.nextLine();
		
		System.out.print("Nhap so luong trong 1 hop: ");
		sl = sc.nextInt();
		
		System.out.print("Nhap chieu dai: ");
		dai = sc.nextInt();
		
		System.out.print("Nhap chieu ngang: ");
		ngang = sc.nextInt();
		
		System.out.print("Nhap gia ban: ");
		gia = sc.nextLong();
		
		sc.nextLine();
	}
	
	public void hienThi() {
		System.out.println("Ma so: " + maso + " | mau: " + mau);
		System.out.println("So luong: " + sl + " | Chieu dai: " + dai + " | Chieu ngang: " + ngang);
		System.out.println("Gia ban: " + gia);
	}
	
	public float giaBanLe() {
		return (float) gia / sl * 1.2f;
	}
	
	public long giaBan() {
		return gia;
	}
	
	public String maso() {
		return maso;
	}
	
	public long dienTich() {
		return (long)dai*ngang;
	}
	
	public long toiDa() {
		return (long)dai*ngang*sl;
	}
	
	public int soLuongHop(int D, int N) {
		long dienTichNen = (long) D * N;
	    long dienTichHop = toiDa();

	    return (int) ((dienTichNen + dienTichHop - 1) / dienTichHop);
	}
	

}
