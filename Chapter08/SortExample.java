package Chapter08;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) { //pulic int compareTo (비교할 데이터); -> 순서를 바꾸고 싶으면 양수, 
		int[] numbers = { 4, 1, 9, 2, 6, 7, 8, 3 };
		String[]strings = {"가","다","하","나","바","사","차"};
		Arrays.sort(strings);
		System.out.println(Arrays.toString(strings));
	
//	static void swap(int a, int b) {
//		int tmp = a;
//		a = b;
//		b = tmp;
	}
}
