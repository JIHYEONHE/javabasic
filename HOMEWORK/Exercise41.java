package HOMEWORK;

import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요:");
		int x = scanner.nextInt();
		System.out.print("삼각형의 두번쨰 변의 길이를 입력하세요:");
		int y = scanner.nextInt();
		System.out.print("삼각형의 세번쨰 변의 길이를 입력하세요:");
		int z = scanner.nextInt();

		int small = x < y && x < z ? x : (y < z ? y : z);
		int large = x > y && x > z ? x : (y > z ? y : z);
		int middle = (x + y + z) - small - large;

		if (small + middle > large) {
			System.out.println("삼각형을 만들 수 있습니다.");
		} else {
			System.out.println("삼각형을 만들 수 없습니다.");
		}

	}
}
//String ans = (x+y>z)&&(x+z>y)&&(z+y>x)?"삼각형을 만들 수 있습니다.":"삼각형을 만들 수 없습니다.";
//if(a+b>=c&&a+c>=b&&b+c>=a)