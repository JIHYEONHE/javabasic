package chapter04;

public class HWMULTIPLE3 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;

			}
		}
		System.out.println("3배수의 총 합:" + sum);
	}
}
