package SECTION02;

public class EX02_21 {
	public static void main(String[] args) {
		int num1 = 11;
		double num2 = 3.14;
		double num1Change = (double) num1;

		System.out.println("num1 : " + num1);// int형
		System.out.println("num1Change : " + num1Change);// 형변환됨
		System.out.println(num1Change + num2);// 실수형으로 변환 후 계산
		System.out.println((int) 1.23);// 짤림
	}
}
