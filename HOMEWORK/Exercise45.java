package HOMEWORK;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	Random random=new Random();
	int num = random.nextInt(100)+1;
	
	int cnt = 0;
	
	while(true){
		cnt++;
	System.out.println("1부터 100 사이의 정수 중 하나를 선택하세요:");
	int a = scanner.nextInt();
			
	if(num>a) {
		System.out.println("정답은 더 큰 수 입니다.");
	}else if(num<a) {
		System.out.println("정답은 더 작은 수 입니다.");
	}else {
		System.out.println("정답입니다.");
		break;
	}
	}
	System.out.println("게임을 종료합니다.");
	System.out.println(cnt+"번 만에 맞추셨습니다.");
	
		
}
}
