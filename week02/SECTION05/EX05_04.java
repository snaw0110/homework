package SECTION05;

public class EX05_04 {
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {// 7줄
			for (int j = 0; j < 7 - i; j++) {
				System.out.print(" ");// 공백 역삼각형
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");// 갈 수록 많이 출력
			}
			System.out.println();
		}

	}
}
