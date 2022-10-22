package chapter02;

import java.util.Scanner;

public class Exercise21 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("가로의 길이는?(단위:m):");
	String strwidth=scanner.nextLine();
	System.out.print("세로의 길이는?(단위:m):");
	String strheight=scanner.nextLine();
	
	double width = Double.parseDouble(strwidth);
	double height = Double.parseDouble(strheight);
	double area = (width*height);
	double perimeter = (width*2+height*2);
	System.out.println("직사각형의 넓이: " + area);
	System.out.println("직사각형의 둘레: "+ perimeter);
	
}
}
