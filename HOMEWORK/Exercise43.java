package HOMEWORK;

import java.util.Scanner;

public class Exercise43 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("점수를 입력하세요.");
	
	System.out.print("프로그래밍 기초:");
	int a = scanner.nextInt();
	System.out.print("데이터베이스:");
	int b = scanner.nextInt();
	System.out.print("화면 구현:");
	int c = scanner.nextInt();
	System.out.print("애플리케이션 구현:");
	int d = scanner.nextInt();
	System.out.print("머신러닝:");
	int e = scanner.nextInt();
	
	int total= (a+b+c+d+e);
	double ave =(double) total/5;
	System.out.println("총점:"+total );
	System.out.printf("평균:%.2f",ave);
	System.out.println();
	
	
	if(ave>=90) {
		System.out.println("학점: A");
	}else if (ave>=80&&ave<90) {
		System.out.println("학점: B");
	}else if (ave>=70&&ave<80) {
		System.out.println("학점: C");
	}else if (ave>=60&&ave<70) {
		System.out.println("학점: D");
	}else {
		System.out.println("학점: F");
	}
	
}
}
