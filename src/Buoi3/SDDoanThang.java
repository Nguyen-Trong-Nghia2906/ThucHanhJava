package Buoi3;

public class SDDoanThang {
	public static void main(String[] args) {
		DoanThang AB = new DoanThang(2, 5, 20, 35);
		AB.tinhTien(5, 3);
		AB.hienThi();

		DoanThang CD = new DoanThang();
		CD.nhapToaDo();

		System.out.printf("Do dai doan thang CD: %.3f", CD.doDai());
	}

}
