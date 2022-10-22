package Chapter11;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassExample {
	public static void main(String[] args) {
		//Reflection
		Class class1 = Member.class; //member라는 클래스의 메타정보를 class를 통해 알 수 있음
		Class class2= Class.forName("Chapter11.Member");
		
		Member member = new Member("a001", "김은대", 100);
		Class class3 = member.getClass();
		
		Field[]fields = class3.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getName());
		}
		Method[]methods = class3.getDeclaredMethods();
		System.out.println(methods.length);
		methods[0].setAccessible(true);
		methods[0].invoke(member, "홍길동");
	}
}
