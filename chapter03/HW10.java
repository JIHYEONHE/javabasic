package chapter03;

public class HW10 {
public static void main(String[] args) {
	int var1= 10;
	int var2= 3;
	int var3= 14;
	double var4 = (var1*var1)*Double.parseDouble(var2+"."+var3); //(반지름x반지름)x (피연산자가 문자열일 정우 나머지 피연산자도 문자열로 문자열결합연산->3.14)
	System.out.println("원의 넓이:"+ var4);
}
}
