package chapter04;

public class HWP5 {
	public static void main(String[] args) {
		for (int i = 1; i <=4; i++) {       //줄(row)
			for (int j = 1; j <= i; j++) {   //세로(column)
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
