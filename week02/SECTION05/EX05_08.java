package SECTION05;

import java.util.Scanner;

public class EX05_08 {
	public static void main(String[] args) {
		int magicNumber = (int) (Math.random() * 50 + 1);// Math.random()으로 난수 생성
		Scanner scan = new Scanner(System.in);

		boolean isMached = false;

		for (int i = 0; i < 10; i++) {
			System.out.print("찾는 숫자를 입력 : ");
			int guess = scan.nextInt();

			if (guess == magicNumber) {
				System.out.println(i + 1 + "번째에 맞췄습니다");// 맞췄을 경우
				isMached = true;
				break;
			} else if (guess > magicNumber)
				System.out.println("맞춰야할 숫자가 더 작습니다");// 입력값이 큰 경우
			else
				System.out.println("맞춰야할 숫자가 더 큽니다");// 입력값이 작은 경우
		}

		if (!isMached)
			System.out.println("정답을 맞추지 못했습니다");
	}
}
