package Chapter08;

public class MyClassExample {
	public static void main(String[] args) {
		Myclass class1 = new MyClass();
		class1.control.turnOn();
		class1.control.setVolume(5);

		MyClass class2 = new MyClass(new Audio());
		
		Myclass class3 = new MyClass();
		class3.methodA();
		
		Myclass class4 = new MyClass(new Audio());
		class4.mehtodB();
	}

}
