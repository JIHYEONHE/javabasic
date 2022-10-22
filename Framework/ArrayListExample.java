package Framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// new ArrayList<배열 객체 타입,타입을 선언할 때 명시>();
		List<String> list = new ArrayList<>(); // 같거나 상위타입을 써야해서 부모타입인 List 사용
		//1.
		ArrayList<String>strList = new ArrayList<>();
		//2.
		List<String>list = new ArrayList<>();
		//3.
		List<String>list2 = Arrays.asList("Java","JDBC","Servlet/JSP");
		//add
		list.add("Java"); // 0번째
		list.add("JDBC"); // 1번쨰
		list.add("Servlet/JSP"); // 3번째
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println();
		list.add(2, "Database"); // 2번째
		list.add("myBatis");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		System.out.println();
		//get
		String skill = list.get(1); // 4번째 배열에 있는 것 가져올 수 있음
		System.out.println(skill);
		
		//remove
		list.remove(0); //0번째 있는 데이터가 없어지고 뒤에 데이터들이 앞으로 채워짐
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		System.out.println();
		
		list.remove("myBatis");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		System.out.println();
		
		list.clear(); //모두 삭제 하기 때문에 사이즈 0
		System.out.println(list.size());
	}

}
