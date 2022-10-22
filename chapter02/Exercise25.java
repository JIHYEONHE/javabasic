package chapter02;

import java.util.Scanner;

public class Exercise25 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("500원짜리의 동전의 갯수: ");
	int coin500 =scanner.nextInt();
	System.out.print("100원짜리의 동전의 갯수: ");
	int coin100 =scanner.nextInt();
	System.out.print("50원짜리의 동전의 갯수: ");
	int coin50 =scanner.nextInt();
	System.out.print("10원짜리의 동전의 갯수: ");
	int coin10=scanner.nextInt();
	
	
	
	int totalcoin=500*coin500+ 100*coin100+ 50*coin50+ 10*coin10;
	System.out.println("저금통 안의 동전의 총 액수: "+ totalcoin); 
}
}	
	