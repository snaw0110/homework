package SECTION04;

import java.util.Scanner;

public class EX04_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// scanner 생성
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();// 입력 받기

		if (age > 19)
			System.out.println("성인입니다");
		else
			System.out.println("미성년자입니다");
	}
}
