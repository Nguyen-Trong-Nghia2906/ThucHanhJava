package Buoi2;

public class SDDiem {
	public static void main(String[] args) {
		Diem A = new Diem(3,4);
		Diem B = new Diem();
		B.nhapDiem();
		
		Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
		C.hienThi();
		
		System.out.printf("Khoang cach tu diem B den tam O: %.3f\n", B.khoangCach());
		System.out.printf("Khoang cach tu diem A den tam B: %.3f", A.khoangCach(B));
	}
	
}
