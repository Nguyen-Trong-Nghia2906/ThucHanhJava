package Buoi3;

import java.util.Scanner;

public class SDGach {

	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		n = sc.nextInt();
		Gach[] ds = new Gach[n];
		Gach max = new Gach();
		for(int i = 0; i < n; i++) {
			ds[i] = new Gach();
			ds[i].nhap();
			
			
		}
		max = ds[0];
		long [] chiPhi = new long[n];
		System.out.println();
		for(int i = 0; i < n; i++) {
			ds[i].hienThi();
			
			chiPhi[i] = (long)ds[i].soLuongHop(1500, 500)*ds[i].giaBan();
			System.out.print("Chi phi khi lot (dien tich 500cm*1500cm) cua loai gach ma so " + ds[i].maso() + " : " + chiPhi[i]);
			
			
			if((ds[i].giaBan()/ds[i].toiDa()) < (max.giaBan()/max.toiDa())){
				max = ds[i];
			}
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("Loai gach co chi phi thap nhat: ");
		max.hienThi();
		
		
		
		
	}

}
