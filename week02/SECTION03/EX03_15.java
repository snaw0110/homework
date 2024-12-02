package SECTION03;

public class EX03_15 {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;

		System.out.println("논리곱");
		System.out.println(b1 && b2);// false
		System.out.println(b1 && b3);// true
		System.out.println(b1 && b4);// false
		System.out.println();

		System.out.println("논리합");
		System.out.println(b1 || b2);// true
		System.out.println(b1 || b3);// true
		System.out.println(b2 || b4);// false
		System.out.println();

		System.out.println("배타적 논리합");
		System.out.println(b1 ^ b2);// true
		System.out.println(b1 ^ b3);// false
	}
}
