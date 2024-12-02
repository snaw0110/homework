package SECTION02;

public class EX02_27 {
	public static void main(String[] args) {
		int i = 10;
		byte b = (byte) i;
		System.out.println("int -> byte i의 값 : " + i + " b의 값 : " + b);

		int j = 1000;
		byte c = (byte) j;// 범위를 벗어나 손실됨
		System.out.println("int -> byte j의 값 : " + j + " c의 값 : " + c);
	}
}
