package chapter03;

import java.util.Scanner;

public class Exercise33 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("윤년인지를 확인할 연도를 입력하세요 :");
	 int first = scanner.nextInt();  //4의배수, 100의배수는 x, 400의배수는 무조건윤년
	 
	 String a = first + "년은 운년이 아닙니다.";
	 String b = first + "년은 윤년입니다.";
	 int c = (first%4);
	 int d = (first%400);
	 
	 String ans= (c==0)?(b):((d==0 && first%100!=0)?(b):(a));
	 System.out.println(ans);   
	 
	 
}
}
