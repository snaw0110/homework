package SECTION04;

import java.util.Scanner;

public class EX04_05 {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int max = 0;

		if (a > b)
			max = a;// false
		else
			max = b;// true
		System.out.println(a + "와 " + b + "중 큰 수는 " + max + "입니다");
	}
}
