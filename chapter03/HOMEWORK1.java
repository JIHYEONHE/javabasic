package chapter03;

import java.util.Scanner;

public class HOMEWORK1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("첫번째 수 :");
	 double first = scanner.nextDouble();
	 System.out.print("두번째 수 :");
	 double second = scanner.nextDouble();
	 
	 System.out.println("-------------------------");
	 
	 String ans= (second!=0)? "결과:"+String.valueOf(first/second) : "결과:무한대";
	 System.out.println(ans);
	 
	 //double num3 = first / second;
	 //string num5 = 
	 
	
	 
	 
//	 double answer = first/second;
//	 System.out.println("-------------------");
//	 
//	 if (second !=0){                    //!= 는 같으면 false 다르면 true
//	 System.out.println("결과:"+ answer);
//	 }
//	 else {
//		 System.out.println("결과:무한대");
//	 }
	 
	 
	
	 
	 
	 
	 
	 
}
}
