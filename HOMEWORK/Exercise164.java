package HOMEWORK;

import java.util.Random;

public class Exercise164 {
	public static void main(String[] args) {
		Random random = new Random();
		int oneCount = 0;
		int twoCount = 0;
		int threeCount = 0;
		int fourCount = 0;
		int fiveCount = 0;
		int sixCount = 0;

		for (int i = 0; i < 10000; i++) {
			int dice = random.nextInt(6) + 1;

			if (dice == 1) {
				oneCount++;
			} else if (dice == 2) {
				twoCount++;
			} else if (dice == 3) {
				threeCount++;
			} else if (dice == 4) {
				fourCount++;
			} else if (dice == 5) {
				fiveCount++;
			} else {
				sixCount++;
			}
		}
		System.out.println("----------------------");
		System.out.println("면                 빈도");
		System.out.println("-----------------------");
		System.out.println("1" + "----------" + oneCount);
		System.out.println("2" + "----------" + twoCount);
		System.out.println("3" + "----------" + threeCount);
		System.out.println("4" + "----------" + fourCount);
		System.out.println("5" + "----------" + fiveCount);
		System.out.println("6" + "----------" + sixCount);
	}
}
