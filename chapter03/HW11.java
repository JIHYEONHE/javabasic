package chapter03;

import java.util.Scanner;

public class HW11 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("아이디:");
	String name = scanner.nextLine();
	
	System.out.println("패스워드:");
	String strPassword = scanner.nextLine();
	int password = Integer.parseInt(strPassword);
	
	if(name.equals("java")) { //java는 문자열이라서 ==을 쓰지 못함 equals 메소드 사용 /참조형은 비교연산자 사용을 하지 못함 
	 if(password == 12345) 
	 { System.out.println("로그인 성공");	}
	else 
	{System.out.println("로그인 실패:패스워드가 틀림");}}
	else {
		System.out.println("로그인 실패:아이디 존재하지 않음");
	}
}
}
