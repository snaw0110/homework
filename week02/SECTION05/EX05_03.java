package SECTION05;

public class EX05_03 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 2; i <= 9; i++) {// 8번 반복
			for (int j = 1; j <= 9; j++) {// 9번 반복
				System.out.print(i + "X" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}
}
