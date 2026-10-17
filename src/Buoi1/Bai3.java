package Buoi1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai3 {
	public static void nhapKyTu() {
		Scanner sc = new Scanner(System.in);
		
		char c;
		do {
			System.out.println("Nhap ky tu: ");
			c = sc.nextLine().charAt(0);
		}
		while(c != 'q');
	}
	
	

	public static void main(String[] args) {
		nhapKyTu();
	}

}
