package SECTION02;

public class EX02_24 {
	public static void main(String[] args) {
		double pie = 3.14;
		int pieInt = (int) pie;
		System.out.println(pieInt);// 실수 -> 정수

		int num = 100;
		double numD = (double) num;
		float numF = (float) 100;
		System.out.println(numD);// 정수 -> 실수
		System.out.println(numF);// 정수 -> 실수

		int i = 99999999;
		float f = (float) i;
		System.out.println(f);// 정수 -> 실수(범위 밖)
	}
}
