package Buoi1;

import java.util.Scanner;

public class Bai5 {

	public static void giaiPTBac2(double a, double b, double c) {
		double x1, x2;
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phuong trinh co vo so nghiem");
			}
			else if(c == 0) {
				System.out.println("Phuong trinh co mot nghiem duy nhat x= 0");
			}
			else {
				System.out.printf("Phuong trinh co mot nghiem duy nhat: %.3f", -c/b);
			}
			
		}
		else {
			double delta = b*b - 4*a*c;
			if(delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			}
			else if(delta == 0) {
				x1 = -c/b;
				System.out.printf("Phuong trinh co nghiem kep x1 = x2 = %.3f", x1);
			}
			else{
				x1 = (-b + Math.sqrt(delta))/(2*a);
				x2 = (-b - Math.sqrt(delta))/(2*a);
				System.out.printf("X1 = %.3f", x1);
				System.out.printf("\nX1 = %.3f", x2);
			}
		}
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		giaiPTBac2(a, b, c);
	}

}
