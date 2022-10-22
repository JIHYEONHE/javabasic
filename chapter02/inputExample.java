package chapter02;

import java.util.Scanner;

public class inputExample {
public static void main(String[] args) {
	//System.in.read();
	//Scanner 를 이용해서 데이터 입력받기 
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("정수를 입력하세요:");
	int value1 = scanner.nextInt(); //결과창에서 입력하면 데이터가 적용됌 (정수)
	System.out.println("실수를 입력하세요:");
	double value2 = scanner.nextDouble(); //실수
	String next = scanner.next(); //공백 전까지 적용
	String nextLine = scanner.nextLine(); //전체 적용
	System.out.println(value1);
	System.out.println(value2);
	System.out.println(next);
	System.out.println(nextLine);
	
	
	
}
}
