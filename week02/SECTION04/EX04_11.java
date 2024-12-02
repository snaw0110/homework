package SECTION04;

import java.util.Scanner;

public class EX04_11 {
	public static void main(String[] args) {
		int num = 7;

		switch (num) {
		case 1:
			System.out.println("num은 1입니다");
		case 7:
			System.out.println("num은 7입니다");// true
		default:
			System.out.println("num은 1도 7도 아닙니다");// break안해서 실행됨
		}

	}
}
