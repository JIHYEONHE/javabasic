package Chapter05;

//문자열을 만들때는 String strVar1 이런 형식으로 만들고 / 비교할때는 strVar1.equals(strVar2)를 쓰는 것이 좋다
public class StringEqulasExample {
	public static void main(String[] args) {
		// JDK 1.5부터 String Pool(문자열 관리 공간을 만듬)
		String strVar1 = "신민철"; // string pool때문에 strvar2는 var1을 참조하게됨
		String strVar2 = "신민철"; // 같은 문자열이라면 new string 쓰지않고 그냥 이렇게 만들어서 메모리 사용을 줄임

		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}

		String strVar3 = new String("신민철"); // new 를 써서 새롭게 했기 때문에 각각 다른 객체가 만들어 지기때문에 다름
		String strVar4 = new String("신민철");

		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		if (strVar3.equals(strVar4)) { // 개발자는 리터럴로 스트링을 선언할 수 있지만 사용자의 데이터는 new string 으로 만들어짐 ->string 비교할때는 equals를
										// 사용해야함
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}
}
