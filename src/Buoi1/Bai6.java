package Buoi1;

import java.util.Scanner;

public class Bai6 {
	public static int soNguyenTo(int n) {
		if(n < 2) {
			return 0;
		}
		else {
			for(int i = 2; i <= n/2; i++) {
				if(n%i == 0) {
					return 0;
				}
			}
			return 1;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(soNguyenTo(n) == 1) {
			System.out.println( n + " la so nguyen to");
		}
		else {
			System.out.println( n + " khong la so nguyen to");
		}
		
	}

}
