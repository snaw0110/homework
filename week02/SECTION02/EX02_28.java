package SECTION02;

public class EX02_28 {
	public static void main(String[] args) {
		double d1 = 1.1234;
		float f1 = (float) d1;
		System.out.println("double -> float d1의 값 : " + d1 + " f1의 값 : " + f1);

		double d2 = 1.0e-50;
		float f2 = (float) d2;// 손실
		System.out.println("double -> float d2의 값 : " + d2 + " f2의 값 : " + f2);

		double d3 = 1.0e100;
		float f3 = (float) d3;// 손실
		System.out.println("double -> float d2의 값 : " + d3 + " f3의 값 : " + f3);

		double d4 = 9.123456789;
		float f4 = (float) d4;// double과 float의 정밀도 차
		System.out.println("정밀도 차이 d4의 값 : " + d4 + " f4의 값 : " + f4);
	}
}
