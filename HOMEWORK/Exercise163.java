package HOMEWORK;

import java.util.Random;
import java.util.Scanner;

public class Exercise163 {
public static void main(String[] args){
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	//입력
	System.out.print("가위 바위 보를 입력하세요:");
	String gamer = scanner.nextLine();
	
	String[] com= {"가위","바위","보"};
	String comResult = com[random.nextInt(3)]; //0부터2까지의 랜덤숫자 0은 가위 1은 바위 2는 보
	       
	System.out.print("게이머:"+gamer);
	System.out.println("인공지능 컴퓨터:"+ comResult);
	//처리
	String result="";
	if (gamer.equals(comResult)) {
		result = "결과: 무승부";
	} else if ((gamer.equals("가위") && comResult.equals("보")) || (gamer.equals("바위") &&comResult.equals("가위"))
			|| (gamer.equals("보") && comResult.equals("바위"))) {
		result = "결과: 게이머 승리!";
	} else {
		result = "인공지능 컴퓨터 승리!";
	}//결과
	System.out.println("결과"+result);
}
}
