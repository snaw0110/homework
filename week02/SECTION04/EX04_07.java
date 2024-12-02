package SECTION04;

public class EX04_07 {
	public static void main(String[] args) {
		int favorite = 7;

		if (favorite < 5)// 1번 조건
			System.out.println("좋아하는 숫자가 5보다 작습니다");
		else if (favorite > 5)// 2번 조건
			System.out.println("좋아하는 숫자가 5보다 큽니다");
		else// 다 아니면
			System.out.println("좋아하는 숫자가 5입니다");
	}
}
