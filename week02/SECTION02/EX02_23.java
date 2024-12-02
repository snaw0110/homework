package SECTION02;

public class EX02_23 {
	public static void main(String[] args) {
		double d1 = 1.0e100;
		float f1 = (float) d1;
		System.out.println(f1);// 범위 초과로 무한대

		double d2 = 1.0e-100;
		float f2 = (float) d2;
		System.out.println(f2);// 범위 초과로 0.0
	}
}
