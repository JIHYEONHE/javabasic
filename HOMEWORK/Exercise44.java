package HOMEWORK;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("가위 바위 보 게임");

		System.out.print("철수:");
		String cheolsu = scanner.next();  
		System.out.print("영희:");   
		String younghui = scanner.next();
		String result ="";
		if (cheolsu.equals(younghui)) {
			result = "결과: 무승부";
		} else if ((cheolsu.equals("가위") && younghui.equals("보")) || (cheolsu.equals("바위") && younghui.equals("가위"))
				|| (cheolsu.equals("보") && younghui.equals("바위"))) {
			result = "결과: 철수 승리!";
		} else {
			result = "영희 승리!";
		}
		System.out.println("결과"+result);
	}
}

//if((a.equals("가위") && b.equals("보")) || (a.equals("바위") && b.equals("가위")) || (a.equals("보")&&b.equals("바위"))){
//System.out.println("결과: 철수 승리!");
//} else if ((a.equals("보")&&b.equals("가위"))||(a.equals("가위")&&b.equals("바위"))||(a.equals("바위")&&b.equals("보"))){
//System.out.println("결과: 영희 승리!");
//} else if ((a.equals("가위")&&b.equals("가위"))||(a.equals("바위")&&b.equals("바위"))||(a.equals("보")&&b.equals("보"))) {
//System.out.println("결과: 무승부!");
//}else {
//System.out.println("가위,바위,보 만 가능");
//}

//if((a.equals("가위") && b.equals("보")) || (a.equals("바위") && b.equals("가위")) || (a.equals("보")&&b.equals("바위"))){
//System.out.println("결과: 철수 승리!");
//} else if ((a.equals("보")&&b.equals("가위"))||(a.equals("가위")&&b.equals("바위"))||(a.equals("바위")&&b.equals("보"))){
//System.out.println("결과: 영희 승리!");
//} else  {
//System.out.println("결과: 무승부!");
