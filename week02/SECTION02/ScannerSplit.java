package SECTION02;

import java.util.Scanner;

public class ScannerSplit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// 스캐너 생성

		String name, adrress;
		int age;
		double weight;

		System.out.println("이름, 주소, 나이, 체중을 순서대로 입력해주세요");
		name = scan.next();
		adrress = scan.next();
		age = scan.nextInt();//int형
		weight = scan.nextDouble();//double형

		System.out.printf("당신의 이름은 %s입니다\n", name);
		System.out.printf("당신의 주소는 %s입니다\n", adrress);
		System.out.printf("당신의 나이는 %d세입니다\n", age);
		System.out.printf("당신의 체중은 %.1fkg입니다\n", weight);

	}
}
