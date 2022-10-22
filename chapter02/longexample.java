package chapter02;

public class longexample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000; 정수 리터럴 (int)의 허용범위 (2147483647)를 넘었으므로 L을 붙어야함
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
