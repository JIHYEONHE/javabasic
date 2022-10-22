package chapter02;

import java.util.Scanner;

public class exercise22e {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double distance = 40e12;
	double speed = 300000;
	double result= distance/speed/60/60/24/365;
	//300초 => 5분
	//60*60*24*365
	System.out.println(result);
	}

}
