
public class Hello {
	public static void main(String[] args) {
		// System.out.println("안녕,Java!!");
		// 구구단 출력
		int a = 2;
		int b = 1;
		while (a <= 9) { // 10단까지
			System.out.println(a + "단");
			while (b <= 9) {
				System.out.println(a + "X" + b + "=" + (a * b));
				b = b + 1;
			}
		   //2*8=18 =>9를 1로 초기화
			b = 1;
			//단을 1증가
			a = a + 1;
		}
	}
}
