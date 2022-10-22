package chapter02;

import java.util.Scanner;

public class Exercise23 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위:cm):");
	String strRadius=scanner.nextLine();
	System.out.print("원기둥의 높이를 입력하시오.(단위:cm):");
	String strHigh=scanner.nextLine();
			
	double num1 = Double.parseDouble(strRadius);
	double num2 = Double.parseDouble(strHigh);
	double wide = (num1*num1*Math.PI);
	double volume = (num1*num1*num2*Math.PI);
	
	System.out.println("원기둥 밑변의 넓이는 " +wide+"cm²이고, 원기둥의 부피는 "+volume+"cm³다");
	scanner.close();
	
	
	
}
}
