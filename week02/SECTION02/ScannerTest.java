package SECTION02;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//스캐너 생성

		System.out.println("나이를 입력해 주세요");
		int age = scan.nextInt();//정수형 입력
		System.out.printf("내 나이는 %d세입니다", age);
	}
}
