package chapter03;

import java.util.Scanner;

public class Exercise31 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("첫 번째 숫자를 입력하세요:");
	int one = scanner.nextInt();
	
	System.out.print("두 번째 숫자를 입력하세요:");
	int two = scanner.nextInt();
	
	int a = ((one+two)+Math.abs(one-two))/2; //큰수
	int b = ((one+two)-Math.abs(one-two))/2; //작은수
	int r1 = a/b;
	int result = a%b;
	System.out.println("큰 수를 작은 수로 나눈 몫은 "+r1+"이고, 나머지는 "+result+"이다.");
}
}


//System.out.printf("큰 수로 작은 수를 나눈 몫은 %d이고,나머지는%d이다.r1,result );	