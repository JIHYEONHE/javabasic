package Chapter10.Homework;

import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.print("어떤 수를 나누시겠습니까?>>");
				//'a b' 가 입력되었을 때
				//next() : 공백 또는 엔터 -- a 
				//nextLine(): 엔터만  ---- a b
				String data1 = scanner.nextLine();
				int value1 = Integer.parseInt(data1); 
															//int dividend = Interger.parseInt(scanner.nextLine());
				System.out.print("어떤 수로 나누시겠습니까?>>");
				String data2 = scanner.nextLine();
				int value2 = Integer.parseInt(data2);
															//int divisor = Interger.parseInt(scanner.nextLine());
				int result = value1 / value2;
				System.out.printf("%d/%d = %d\n", value1, value2, result);
				
				break;  //정상적이면 break 에서 끝남
			}catch (NumberFormatException e) { //에러가 발생하면 catch
					System.out.println("잘못된 입력입니다. 다시 입력해주세요."); 
			} catch (ArithmeticException e) { //에러가 발생하면 catch
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요."); 
			}
			
		}
		scanner.close();
	}

}

