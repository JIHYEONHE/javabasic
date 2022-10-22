package chapter02;

public class exampleproblem88 {
public static void main(String[] args) {
	//p.87 예시문제 8번
		double var1 = 3.5;
		double var2 = 2.7;
		int result = (int)(var1+ var2);
		System.out.println("result:"+ result);
		
		//9번
		long var3 = 2L;
		float var4 = 1.8f;
		double var5 = 2.5;
		String var6 = "3.9";
		int ccc = (int)(var3+var4+var5)+(int) Double.parseDouble(var6);
		System.out.println(ccc);
		
		//10번
		String str1 = 2+3+"";
		String str2 = 2+""+3;
		String str3 = ""+2+3;
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//11번
		byte value = Byte.parseByte("10");
	    int value1 =Integer.parseInt("1000");
	    float value2 = Float.parseFloat("20.5");
	    double value3 = Double.parseDouble("3.14159");
	    System.out.println(value);
	    System.out.println(value1);
	    System.out.println(value2);
	    System.out.println(value3);
	   
	    
}
}
