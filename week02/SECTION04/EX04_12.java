package SECTION04;

import java.util.Scanner;

public class EX04_12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// scanner 생성
		System.out.print("숫자를 입력하세요(1~5) : ");
		int num = scan.nextInt();// 입력 받기

		switch (num) {// 1~5 맞는 케이스 실행
		case 5:
			System.out.println("num은 5입니다");
			break;
		case 4:
			System.out.println("num은 4입니다");
			break;
		case 3:
			System.out.println("num은 3입니다");
			break;
		case 2:
			System.out.println("num은 2입니다");
			break;
		case 1:
			System.out.println("num은 1입니다");
			break;
		default:
			System.out.println("1~5를 입력해 주세요");// 예외
		}

	}
}
