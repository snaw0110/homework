package SECTION04;

import java.util.Scanner;

public class EX04_10 {
	public static void main(String[] args) {
		int num = 7;

		switch (num) {
		case 1:
			System.out.println("num은 1입니다");
			break;
		case 7:
			System.out.println("num은 7입니다");// true
			break;
		default:
			System.out.println("num은 1도 7도 아닙니다");
			break;
		}

	}
}
