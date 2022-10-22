package Chapter10;

import java.util.Scanner;

//Alt+shift+z
public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("첫번째 숫자를 입력하세요>");
				String data1 = scanner.nextLine();
				System.out.print("두번째 숫자를 입력하세요>");
				String data2 = scanner.nextLine();
				int value1 = Integer.parseInt(data1);
				int value2 = Integer.parseInt(data2);
				int result = value1 + value2;
				System.out.printf("%d+%d = %d\n", value1, value2, result);
				break;  //정상적이면 break 에서 끝남
			} catch (NumberFormatException e) { //에러가 발생하면 catch
				System.out.println("숫자를 입력하세요."); //break 없어서 위로 다시 올라감 
			}
		}
		scanner.close();
	}
}
