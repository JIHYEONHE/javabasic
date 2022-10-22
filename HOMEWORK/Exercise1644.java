package HOMEWORK;

import java.util.Random;

public class Exercise1644 {
public static void main(String[] args) {
	Random random = new Random();
	int[]count = new int[6];
	random.nextInt(6);
	
	for (int i=0;i<10000;i++) {
		count[random.nextInt(6)]++;
		//int ranNum=radom.nextInt(6);
		//count[ranNum]++;
	}
}
}
