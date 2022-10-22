package chapter03;

import java.util.Scanner;

public class applebasket {
public static void main(String[] args) {
	
	int numOfapples = 123; 
	int sizeOfbucket = 10;
	int numOfBucket= numOfapples/sizeOfbucket + (numOfapples % sizeOfbucket>0?1:0);
	System.out.println(numOfBucket);
}
}
