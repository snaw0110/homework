package SECTION04;

public class EX04_08 {
	public static void main(String[] args) {
		int favorite = 7;

		if (favorite > 5)// 1번 조건
			System.out.println("좋아하는 숫자가 5보다 큽니다");
		else if (favorite == 7)// 1번 조건이 만족해서 실행x
			System.out.println("좋아하는 숫자가 7입니다");
	}
}
