package Chapter06.package1;

public class A {
//필드
	public int field1;   //public 접근제한
	int field2;          //default접근제한
	private int field3;  //private접근제한
	
	//생성자
	public A() {
		field1 =1;
		field2=1;
		field3=1;
		
		method1();
		method2();
		method3();
	}
	
	//메소드
	public void method1() {}  //public접근제한
	void method2() {}         //default접근제한
	private void method3() {} //private접근제한
		
}
