package Chapter05;

public class Exercise04 {
public static void main(String[] args) {
	//int max = Integer.MIN_VALUE; //최소값
	//int min = Integer.MAX_VALUE;  //최대값
	int max=0;
	int[]array = {1,5,3,8,2};
	int min = array[0]; //첫번째 숫자랑 계속 비교
	for(int i=0; i<array.length;i++) {
		 if(max<array[i]) {
			 max = array[i];
		 } 
		 if(min>array[i]) {
			 min = array[i];
	}
	}
	System.out.println("max:"+max);
	System.out.println("min:"+min);
	
}
}