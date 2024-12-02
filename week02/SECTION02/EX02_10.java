package SECTION02;

public class EX02_10 {
	public static void main(String[] args) {
		int myAge = 20;// 변수1
		int yourAge = 30;// 변수2
		int tempAge;//임시 변수

		tempAge = myAge;//임시 변수에 변수1 저장
		myAge = yourAge;//변수1에 변수2 저장
		yourAge = tempAge;//변수2에 임시변수(변수1값) 저장

		System.out.println(myAge);// 변수 값 교환됨
		System.out.println(yourAge);
	}
}
