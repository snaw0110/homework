package SECTION03;

public class EX03_05 {
	public static void main(String[] args) {
		int num = 30;
		System.out.println(++num);// 전위, 먼저 계산하고 실행
		System.out.println(num);

		System.out.println(num++);// 후위, 실행하고 계산
		System.out.println(num);
	}
}
