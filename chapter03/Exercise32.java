package chapter03;

import java.util.Scanner;

public class Exercise32 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	//입력
	System.out.print("수도입니까?(수도: 1, 수도아님:0)"); //1
	int one = scanner.nextInt();
	System.out.print("총 인구는?(단위: 만)"); //100만이상
	int two = scanner.nextInt();
	System.out.print("연소득이 1억 이상인 인구는?(단위: 만)"); //50만 이상
	int thr = scanner.nextInt();
	//처리
    String ans = (one ==1)&&(two>=100)||(thr>=50)?"이 도시는 메트로 폴리스입니다." : "이 도시는 메트로폴리스가 아닙니다.";
	//출력
    System.out.println(ans);
	
	//String a = "이 도시는 메트로폴리스 입니다.";
    //String b = "이 도시는 메트로폴리스가 아닙니다.";
    //String ans =(one==1)? ((two>=100)?((thr>=50)?a:b):b):b;
	
}
}
