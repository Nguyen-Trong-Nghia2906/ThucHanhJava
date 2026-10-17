package Buoi1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai4 {
	
	
	public static void tinhTong() {
		int a, b, kq;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("Nhap a = ");
				a = sc.nextInt();
				System.out.print("Nhap b = ");
				b = sc.nextInt();
				kq = a +b;	
				System.out.println("Ket qua: " + kq);
				break;
			}catch(InputMismatchException e) {
				System.out.println("Nhap sai dinh dang");
				sc.nextLine();
			}
		}
		
	}
	
	public static void main(String[] args) {
		tinhTong();
		
	}

}
