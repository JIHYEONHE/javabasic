package Chapter13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//사과 한박스 선물받음 -사과 색이 다름 /빨간 녹색 노란/ 사과 색별로 분류해서 저장원함
public class InterfaceExample {
	public static void main(String[] args) {
		public static List<Apple> list = Arrays.asList(
			new Apple(1, Color.RED),
			new Apple(2, Color.RED),
			new Apple(3, Color.GREEN),
			new Apple(4, Color.YELLOW),
			new Apple(5, Color.GREEN),
			new Apple(6, Color.GRaASZCXDF V 0.`EEN),
			new Apple(7, Color.YELLOW),
			new Apple(8, Color.RED),
			new Apple(9, Color.RED),
			new Apple(10, Color.GREEN),
			new Apple(11, Color.RED)
		);
		List<Apple> redApples = FilterUtils.filter(list,newApplePredicate);
		redApples.forEach(System.out::println);
	}
}
