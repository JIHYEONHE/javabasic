package HOMEWORK;

public class Exercise161 {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE; // 최소값
		int min = Integer.MAX_VALUE; // 최대값
		int[] array = { 38, 94, 16, 3, 76, 94, 82, 47, 59, 8 };

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("최댓값:" + max);
		System.out.println("최솟값:" + min);

	}
}
