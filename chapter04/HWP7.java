package chapter04;

import java.util.Scanner;

public class HWP7 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0; // 잔고,잔액
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.예금|2.츨금|3.잔고|4.종료|");
			System.out.println("---------------------------");
			System.out.print("선택>");
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				System.out.print("예금액>");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.print("잔고>" + balance);
				break;
			case 4:
				run = false; //false라서 실행이 종료됨
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}
