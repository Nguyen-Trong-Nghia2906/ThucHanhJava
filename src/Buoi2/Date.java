package Buoi2;

import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;

	public Date() {
		ngay = 1;
		thang = 1;
		nam = 1900;
	}

	public Date(int x, int y, int z) {
		ngay = x;
		thang = y;
		nam = z;
	}

	public void hienThi() {
		System.out.printf("%02d/%02d/%d", ngay, thang, nam);
	}

	public String toString() {

		return ngay + "/" + thang + "/" + nam;
	}

	public boolean hopLe() {
		int[] max = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
			max[2] = 29;
		}
		if (thang < 1 || thang > 12 || ngay < 1 || ngay > max[thang] || nam > 2027) {
			return false;
		}
		return true;
	}

	public void nhapNgay() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.printf("\nNhap ngay: ");
			ngay = sc.nextInt();

			System.out.printf("Nhap thang: ");
			thang = sc.nextInt();

			System.out.printf("Nhap nam: ");
			nam = sc.nextInt();

			if (!hopLe()) {
				System.out.println("Ngay thang nam khong hop le");
			}

		} while (!hopLe());
		sc.nextLine();
	}

	public Date ngayHomSau() {
		Date hs = new Date(ngay + 1, thang, nam);
		if (!hs.hopLe()) {
			hs.ngay = 1;
			hs.thang++;
			if (!hs.hopLe()) {
				hs.nam++;
				hs.thang = 1;
			}
		}
		return hs;
	}

	public Date congNgay(int n) {
		Date date = new Date(ngay, thang, nam);
		for (int i = 0; i < n; i++) {
			date = date.ngayHomSau();
		}
		return date;
	}

}
