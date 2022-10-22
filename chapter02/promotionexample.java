package chapter02;

public class promotionexample {
public static void main(String[] args) {
	//자동 타입변환
	byte bytevalue = 10;
	int intValue = bytevalue;
	System.out.println("intvalue:"+intValue);
	
	char charValue = '가';
	intValue = charValue;
	System.out.println("가의 유니코드:"+ intValue);
	
	intValue = 50;
	long longValue = intValue;
	System.out.println("longValue:"+longValue);

	longValue = 100;
	float floatValue = longValue;
	System.out.println("floatValue:" + floatValue);
	
	floatValue = 100.5f;
	double doubleValue = floatValue;
	System.out.println("doubleValue:"+ doubleValue);
}
}

