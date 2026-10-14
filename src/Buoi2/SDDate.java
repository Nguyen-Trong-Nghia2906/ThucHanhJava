package Buoi2;

public class SDDate {
	public static void main(String[] args) {
		Date d = new Date();
		d.hienThi();
		
		Date d2 = new Date();
		
		Date ngayhomsau = new Date();
		
		d2.nhapNgay();
		
		ngayhomsau = d2.ngayHomSau();
		
		System.out.printf("Ngay hom sau cua ");
		d2.hienThi();
		System.out.printf(" la ");
		ngayhomsau.hienThi();
		
		
		Date congngay = new Date();
		congngay = d2.congNgay(20);
		System.out.println();
		d2.hienThi();
		System.out.print(" sau khi cong 20 ngay la: ");
		congngay.hienThi();
		
		
	}

}
